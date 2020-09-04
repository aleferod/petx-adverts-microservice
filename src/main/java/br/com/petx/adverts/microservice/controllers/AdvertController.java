package br.com.petx.adverts.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.petx.adverts.microservice.dtos.AdvertDto;
import br.com.petx.adverts.microservice.dtos.PictureDto;
import br.com.petx.adverts.microservice.entities.PictureEntity;
import br.com.petx.adverts.microservice.repositories.PictureRepository;

@RestController
@RequestMapping("/advert")
public class AdvertController {

	@Autowired
	private PictureRepository pictureRepository;
	
	@PostMapping()
	public ResponseEntity<AdvertDto> saveAdvert(@RequestBody AdvertDto advertDto){
		return new ResponseEntity<>(advertDto, HttpStatus.CREATED);
	}
	
	@PostMapping("/picture")
	public void saveAdvertPicture(@RequestBody PictureDto pictureDto ) {
		pictureRepository.save(new PictureEntity(pictureDto.getAdvertId(), pictureDto.getBase64()));
	}
	
}

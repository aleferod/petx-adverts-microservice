package br.com.petx.adverts.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petx.adverts.microservice.entities.PictureEntity;

public interface PictureRepository extends JpaRepository<PictureEntity, String>{

}

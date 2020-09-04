package br.com.petx.adverts.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.petx.adverts.microservice.entities.AdvertEntity;

public interface AdvertRepository extends JpaRepository<AdvertEntity, String> {

}

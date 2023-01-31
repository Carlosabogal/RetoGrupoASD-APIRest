package com.asd.repositories;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asd.entities.ActivosFijos;


@Repository
public interface ActivosFijosRepository extends JpaRepository<ActivosFijos,Integer>{

	List<ActivosFijos> findByTipo(String tipo);

	List<ActivosFijos> findBySerial(Integer serial);

	Collection<ActivosFijos> findByDateCompra(LocalDate dateCompra);


	
	

}

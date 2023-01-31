package com.asd.controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asd.entities.ActivosFijos;
import com.asd.repositories.ActivosFijosRepository;
import com.asd.services.ServiceActivosFijos;

@RestController
@RequestMapping("/api/ActivosASD")
@CrossOrigin(origins="http://localhost:4200")
public class ActivosFijosController {

	@Autowired
	private ServiceActivosFijos  serviceActivosFijos;
	ZoneId defaultZoneId = ZoneId.systemDefault();

	@PostMapping("/post")
	public ResponseEntity<?> save(@RequestBody ActivosFijos activosFijos) {
		ActivosFijos addAffili = serviceActivosFijos.save(activosFijos);
		try {
			return new ResponseEntity<>(addAffili, HttpStatus.CREATED);

		} catch (Exception exception) {
			return new ResponseEntity<>("No content", HttpStatus.NOT_FOUND);

		}

	}
	
	@GetMapping("/getlist")
	public ResponseEntity<?> listAllServicesFijos() {

		List<ActivosFijos> ListGet = serviceActivosFijos.listAllServicesFijos();

		if (ListGet.isEmpty()) {
			return new ResponseEntity<>("No content", HttpStatus.NOT_FOUND);

		} else {
			return new ResponseEntity<>(ListGet, HttpStatus.OK);

		}

	}

	@PutMapping("/put/{id}")
	public ResponseEntity<?> PutInfoActivos(@PathVariable(value="id") Integer id,@RequestBody ActivosFijos activosFijosToUpdate) {
		
		Optional<ActivosFijos> updateActivos = serviceActivosFijos.PutInfoActivos(id,activosFijosToUpdate);
		try {
			return new ResponseEntity<>(updateActivos, HttpStatus.CREATED);

		} catch (Exception exception) {
			return new ResponseEntity<>("No content", HttpStatus.NOT_FOUND);

		}
	}
	
	@GetMapping("/getbyTipo/{tipo}")
	public ResponseEntity<?> findByType(@PathVariable(value = "tipo") String tipo) {

		List<ActivosFijos> appoinmentList = this.serviceActivosFijos.findByType(tipo);

		if (appoinmentList.isEmpty()) {

			return new ResponseEntity<>("No content", HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(appoinmentList, HttpStatus.OK);

		}
	}

	
	@GetMapping("/getbySerial/{serial}")
	public ResponseEntity<?> findBySerial(@PathVariable(value = "serial") Integer serial) {

		List<ActivosFijos> appoinmentList = this.serviceActivosFijos.findBySerial(serial);

		if (appoinmentList.isEmpty()) {

			return new ResponseEntity<>("No content", HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(appoinmentList, HttpStatus.OK);

		}

	}
	
	@GetMapping("/getbydate/{day}/{month}/{year}")
	public ResponseEntity<?> findByDate(@PathVariable int year, @PathVariable int month, @PathVariable int day) {
		try {
			LocalDate date1 = LocalDate.of(year, month, day);
			Collection<ActivosFijos> appoinmentList = this.serviceActivosFijos.findByDate(date1);
			System.out.print(appoinmentList.toString());
			if (appoinmentList.isEmpty()) {

				return new ResponseEntity<>("No content", HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(appoinmentList, HttpStatus.OK);

			}
		} catch (Exception exception) {
			return new ResponseEntity<>("No content", HttpStatus.NO_CONTENT);

		}
	}

}

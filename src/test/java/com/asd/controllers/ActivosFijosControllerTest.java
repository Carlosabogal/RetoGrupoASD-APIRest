package com.asd.controllers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.asd.entities.ActivosFijos;



@ExtendWith(MockitoExtension.class)
class ActivosFijosControllerTest {

	@InjectMocks
	private ActivosFijosController activosFijosController = new ActivosFijosController();
	//@Mock
	//private ServiceActivos servicesAppoinmentsMock;


	@Test
	void test() {
		fail("Not yet implemented");
	}

}

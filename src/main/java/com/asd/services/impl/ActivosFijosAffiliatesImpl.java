package com.asd.services.impl;
import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asd.entities.ActivosFijos;
import com.asd.repositories.ActivosFijosRepository;
import com.asd.services.ServiceActivosFijos;
@Service
public class ActivosFijosAffiliatesImpl implements ServiceActivosFijos{

	@Autowired
	private ActivosFijosRepository  activosFijosRepository;

	@Override
	public List<ActivosFijos> listAllServicesFijos() {
		// TODO Auto-generated method stub
		return (List<ActivosFijos>) activosFijosRepository.findAll();
		

	}

	@Override
	public ActivosFijos save(ActivosFijos activosFijos) {
		System.out.println(activosFijos.getDateCompra());
		// TODO Auto-generated method stub
		return activosFijosRepository.save(activosFijos);
		}

	@Override
	public Optional<ActivosFijos> PutInfoActivos(Integer id, ActivosFijos activosFijosToUpdate) {
		// TODO Auto-generated method stub
	Optional<ActivosFijos> activos = activosFijosRepository.findById(id);
		
		if(!activos.isPresent()){
			return null;
		}
		
		activos.get().setNombre(activosFijosToUpdate.getNombre());
		activos.get().setDescripción(activosFijosToUpdate.getDescripción());
		activos.get().setTipo(activosFijosToUpdate.getTipo());
		activos.get().setSerial(activosFijosToUpdate.getSerial());
		activos.get().setNumero(activosFijosToUpdate.getNumero());
		activos.get().setInterno_de_inventario(activosFijosToUpdate.getInterno_de_inventario());
		activos.get().setPeso(activosFijosToUpdate.getPeso());
		activos.get().setAlto(activosFijosToUpdate.getAlto());
		activos.get().setAncho(activosFijosToUpdate.getAncho());
		activos.get().setLargo(activosFijosToUpdate.getLargo());
		activos.get().setValor_compra(activosFijosToUpdate.getValor_compra());
		activos.get().setDateCompra(activosFijosToUpdate.getDateCompra());

		

		
		activosFijosRepository.save(activos.get());

		return activos;	
		}

	@Override
	public List<ActivosFijos> findByType(String tipo) {
		ActivosFijos appoinment = new ActivosFijos();
		appoinment.setTipo(tipo);
		return activosFijosRepository.findByTipo(tipo);

	}

	@Override
	public List<ActivosFijos> findBySerial(Integer serial) {
		ActivosFijos appoinment = new ActivosFijos();
		appoinment.setSerial(serial);
		return activosFijosRepository.findBySerial(serial);
	}

	@Override
	public Collection<ActivosFijos> findByDate(LocalDate dateCompra) {
		ActivosFijos appoinment = new ActivosFijos();
		appoinment.setDateCompra(dateCompra);
;
		return activosFijosRepository.findByDateCompra(dateCompra);
		
	}


	
}

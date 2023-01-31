package com.asd.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.asd.entities.ActivosFijos;
import com.asd.services.ServiceActivosFijos;

public interface ServiceActivosFijos {
	
	public ActivosFijos save(ActivosFijos activosFijos);

	public List<ActivosFijos> listAllServicesFijos();
	public Optional<ActivosFijos> PutInfoActivos(Integer id, ActivosFijos activosFijosToUpdate);	
	public List<ActivosFijos> findByType(String tipo);
	public Collection<ActivosFijos> findByDate(LocalDate dateCompra);

	public List<ActivosFijos> findBySerial(Integer serial);


}

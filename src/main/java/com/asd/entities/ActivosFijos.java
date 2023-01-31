package com.asd.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "ActivosFijos")
public class ActivosFijos {
	@Id
	private Integer id;
	private String nombre;
	private String descripción;
	private String	tipo;
	private Integer serial;
	private Integer numero;
	private Integer interno_de_inventario;
	private String peso;
	private String alto;
	private String ancho;
	private String largo;
	private Integer valor_compra;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy")
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
	@Column(name = "dateCompra", nullable = false)
	private LocalDate dateCompra;
	private String Area;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getSerial() {
		return serial;
	}
	public void setSerial(Integer serial) {
		this.serial = serial;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getInterno_de_inventario() {
		return interno_de_inventario;
	}
	public void setInterno_de_inventario(Integer interno_de_inventario) {
		this.interno_de_inventario = interno_de_inventario;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getAlto() {
		return alto;
	}
	public void setAlto(String alto) {
		this.alto = alto;
	}
	public String getAncho() {
		return ancho;
	}
	public void setAncho(String ancho) {
		this.ancho = ancho;
	}
	public String getLargo() {
		return largo;
	}
	public void setLargo(String largo) {
		this.largo = largo;
	}
	public Integer getValor_compra() {
		return valor_compra;
	}
	public void setValor_compra(Integer valor_compra) {
		this.valor_compra = valor_compra;
	}
	public LocalDate getDateCompra() {
		return dateCompra;
	}
	public void setDateCompra(LocalDate dateCompra) {
		this.dateCompra = dateCompra;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public ActivosFijos(Integer id, String nombre, String descripción, String tipo, Integer serial, Integer numero,
			Integer interno_de_inventario, String peso, String alto, String ancho, String largo, Integer valor_compra,
			LocalDate dateCompra, String area) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.tipo = tipo;
		this.serial = serial;
		this.numero = numero;
		this.interno_de_inventario = interno_de_inventario;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.valor_compra = valor_compra;
		this.dateCompra = dateCompra;
		Area = area;
	}
	public ActivosFijos() {
		super();
	}

}

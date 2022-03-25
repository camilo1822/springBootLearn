package com.jucarbol.productos.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*Anotacion para indicar que va ser clase de JPA, una entidad relacional*/
@Entity
@Table(name = "productos")
/* serializable convierte nuestra clase en bytes */
public class Producto implements Serializable {

	/* Indicamos qeu es llave primaria */
	@Id
	/* Indicamos como se genera, este caso autoincrementable */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Double precio;
	/*
	 * Indicamos como se llama le nombre de la columna en la base de datos cuando
	 * los campos son distintos a como se llama en la tabla, por general en DB van
	 * separados por_
	 */
	@Column(name = "create_at")
	/* Formato de la fecha */
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -528321199843590967L;

}

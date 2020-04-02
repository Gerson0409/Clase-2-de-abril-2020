package com.gerson.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productozz database table.
 * 
 */
@Entity
@NamedQuery(name="Productozz.findAll", query="SELECT p FROM Productozz p")
public class Productozz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cantidadProducto;

	private String nombreProducto;

	private double precioProducto;

	private double totalProducto;

	public Productozz() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return this.precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalProducto() {
		return this.totalProducto;
	}

	public void setTotalProducto(double totalProducto) {
		this.totalProducto = totalProducto;
	}

}
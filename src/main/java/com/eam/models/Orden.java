package com.eam.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idOrden;
	private long userId;
	private Date fechaOrden;
	/**
	 * 
	 */
	public Orden() {
		super();
	}
	/**
	 * @param idOrden
	 * @param userId
	 * @param fechaOrden
	 */
	public Orden(long idOrden, long userId, Date fechaOrden) {
		super();
		this.idOrden = idOrden;
		this.userId = userId;
		this.fechaOrden = fechaOrden;
	}
	/**
	 * @return the idOrden
	 */
	public long getIdOrden() {
		return idOrden;
	}
	/**
	 * @param idOrden the idOrden to set
	 */
	public void setIdOrden(long idOrden) {
		this.idOrden = idOrden;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the fechaOrden
	 */
	public Date getFechaOrden() {
		return fechaOrden;
	}
	/**
	 * @param fechaOrden the fechaOrden to set
	 */
	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	
}

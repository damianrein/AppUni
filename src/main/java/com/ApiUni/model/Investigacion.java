package com.ApiUni.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Investigacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date starDate;
	private Date finishDate;
	private Integer state;
	private String description;
	@ManyToMany
	private Investigador investigadores;
	//private String [] keyWords
//	@ForeignKey
	@OneToMany
	@JoinColumn(name = "id_laboratory", referencedColumnName = "id")
	private Laboratorio laboratory;
	
	public Investigacion() {}
	
	public Investigacion(Long id, Date starDate, Date finishDate, Integer state, String description,
			Laboratorio laboratory) {
		this.id = id;
		this.starDate = starDate;
		this.finishDate = finishDate;
		this.state = state;
		this.description = description;
		this.laboratory = laboratory;
	}
	
	public Date getStarDate() {
		return starDate;
	}
	public void setStarDate(Date starDate) {
		this.starDate = starDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Laboratorio getLaboratory() {
		return laboratory;
	}
	public void setLaboratory(Laboratorio laboratory) {
		this.laboratory = laboratory;
	}
	public Long getId() {
		return id;
	}
	
}

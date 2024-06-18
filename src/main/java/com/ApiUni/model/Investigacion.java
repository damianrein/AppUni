package com.ApiUni.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

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
	@JoinTable(name="investigacion_investigadores",joinColumns = @JoinColumn(name="investigacion_id", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="investigador_id", referencedColumnName = "id"))
	private Investigador investigadores;
	private List<String> keyWords;
	@ManyToOne
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
	public List<String> getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords.add(keyWords);
	}
}

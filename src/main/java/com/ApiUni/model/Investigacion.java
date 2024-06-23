package com.ApiUni.model;

import java.time.LocalDate;
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
	private LocalDate starDate;
	private LocalDate finish;
	@ManyToOne
	@JoinColumn(name="state", referencedColumnName = "id")
	private EstadoInvestigacion state;
	private String topic;
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
	
	public Investigacion(Long id, LocalDate starDate, LocalDate finish, EstadoInvestigacion state, String topic, String description,
			Laboratorio laboratory) {
		this.id = id;
		this.starDate = starDate;
		this.finish = finish;
		this.state = state;
		this.topic = topic;
		this.description = description;
		this.laboratory = laboratory;
	}
	
	public LocalDate getStarDate() {
		return starDate;
	}
	public void setStarDate(LocalDate starDate) {
		this.starDate = starDate;
	}
	public LocalDate getFinish() {
		return finish;
	}
	public void setFinish(LocalDate finish) {
		this.finish = finish;
	}
	public EstadoInvestigacion getState() {
		return state;
	}
	public void setState(EstadoInvestigacion state) {
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}

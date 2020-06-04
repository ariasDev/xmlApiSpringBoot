package com.Bancolombia.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name = "cities")
@JacksonXmlRootElement(localName = "cities")
public class CityEntity {
	
	@Id
	@Column(name="id")
	@JacksonXmlProperty
	int id;
	
	@Column(name="name")
	@JacksonXmlProperty
	String name;
	
	@Column(name="population")
	@JacksonXmlProperty
	String population;
	
	public CityEntity() {
		super();
	}

	public CityEntity(int id, String name, String population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

}

package com.linjith.webinar.models;

public class Country {
	private String name;
	private String language;
	private String population;
	private String medianAge;
	private String area;

	public Country(String name, String language, String population, String medianAge, String area) {
		super();
		this.name = name;
		this.language = language;
		this.population = population;
		this.medianAge = medianAge;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getMedianAge() {
		return medianAge;
	}

	public void setMedianAge(String medianAge) {
		this.medianAge = medianAge;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}

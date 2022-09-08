package com.travel.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weather")
public class Weather {

	@Id 
	//@GeneratedValue
		int id;
		String date;
		double lat;
		double lon;
		String city;
		String state;
		double temperature;

	
	public Weather(int id, String date, double lat, double lon, String city, String state, double temperature) {
		super();
		this.id = id;
		this.date = date;
		this.lat = lat;
		this.lon = lon;
		this.city = city;
		this.state = state;
		this.temperature = temperature;
	}
	
	
	
	public Weather() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Weather [id=" + id + ", date=" + date + ", lat=" + lat + ", lon=" + lon + ", city=" + city + ", state="
				+ state + ", temperature=" + temperature + "]";
	}
	
	
	
}

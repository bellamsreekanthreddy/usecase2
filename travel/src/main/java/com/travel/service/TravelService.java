package com.travel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.entity.Weather;
import com.travel.repository.TravelRepository;

@Service
public class TravelService {
	@Autowired
	TravelRepository travelRepository;
	
	
	public List<Weather> getDetails() {
		List<Weather> weatherDetails= travelRepository.findAll();
		return weatherDetails;
	}
	public void save(Weather weather) {
		travelRepository.save(weather);
	}
	public boolean deleteById(int id) {
		Optional<Weather> weathers=retriveById(id);
		if (weathers.isEmpty()) {
			return false;
		}else {
			travelRepository.deleteById(id);
			return true;
			
		}
		
	}
	public Optional<Weather> retriveById(int id) {
		return travelRepository.findById(id);
	}
	

}

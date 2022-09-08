package com.travel.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.travel.entity.Weather;
import com.travel.service.TravelService;

@RestController
public class TravelController {
	
	@Autowired
	TravelService travelService;
	//Logger logger;
	
	@RequestMapping(value="/weather", method=RequestMethod.GET)
	public List<Weather> retriveAllDetails() {
		List<Weather> weatherDetails= travelService.getDetails();
		return weatherDetails;
	}
	@RequestMapping(value="/weather/{id}", method=RequestMethod.GET)
	public Weather retriveSpceficDetails(@PathVariable int id) {
		Optional<Weather> weather=travelService.retriveById(id);
		return weather.get();
		
	}
	@RequestMapping(value="/weather", method=RequestMethod.POST)
	public ResponseEntity<Object> postDetails(@RequestBody Weather weather) {
		travelService.save(weather);
		return ResponseEntity.created(null).build();
		
		
	}
	@RequestMapping(value="/weather/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteDetails(@PathVariable int id) {
		boolean exists=travelService.deleteById(id);
		if (exists){
			//System.out.println(exists);
			return ResponseEntity.accepted().build();
		}else  {
		//	System.out.println(exists);
			return ResponseEntity.notFound().build();
		}
	}
}

package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.travel.entity.Weather;

public interface TravelRepository extends  JpaRepository<Weather, Integer>{
	

}

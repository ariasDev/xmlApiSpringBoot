package com.Bancolombia.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bancolombia.app.Entity.CityEntity;
import com.Bancolombia.app.Service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	@Autowired
	CityService cityService;
	
	@GetMapping(value="/all", produces=MediaType.APPLICATION_XML_VALUE)
	public List<CityEntity> findAll() {
		return (List<CityEntity>) cityService.findAll();
	}

	@GetMapping(value="/{cityId}", produces=MediaType.APPLICATION_XML_VALUE)
	public CityEntity findById(@PathVariable("cityId") int id) {
		return cityService.findById(id);
	}

	

}

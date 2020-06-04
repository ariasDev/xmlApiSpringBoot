package com.Bancolombia.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bancolombia.app.Entity.CityEntity;
import com.Bancolombia.app.Repository.CityRepository;

@Service
public class CityServiceImp implements CityService{
	@Autowired
	CityRepository cityRepository;

	@Override
	public List<CityEntity> findAll() {
		return (List<CityEntity>) cityRepository.findAll();
	}

	@Override
	public CityEntity findById(int id) {
		return cityRepository.findById(id).orElse(new CityEntity());
	}

}

package com.Bancolombia.app.Service;

import java.util.List;

import com.Bancolombia.app.Entity.CityEntity;

public interface CityService {
	
	List<CityEntity> findAll();
    CityEntity findById(int id);

}

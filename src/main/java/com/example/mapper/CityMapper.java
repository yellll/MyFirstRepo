package com.example.mapper;

import java.util.List;

import com.example.model.City;

public interface CityMapper {
	City getOneCity(int id);
	List<City> getAllCity();
	int delCity(int id);
	int insertCity(City city);
}

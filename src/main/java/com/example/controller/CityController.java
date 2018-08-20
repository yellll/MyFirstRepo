package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapper.CityMapper;
import com.example.model.City;
@RestController
public class CityController {
	@Autowired
	CityMapper cm;
	@GetMapping("/city/{id}")
	public City getOneCity(@PathVariable int id) {
		
		return cm.getOneCity(id);
	}
	
	@GetMapping("/city/all")
	public List<City> getAllCity() {
		
		return cm.getAllCity();
	}
	
	@GetMapping("/city/del/{id}")
	public void delCity(@PathVariable int id) {
		cm.delCity(id);
	}
	
	@GetMapping("/city/add")
	public int insertCity(City city) {
		city.setName("武汉");
		city.setCountry("中国");
		city.setState("湖北");
		return cm.insertCity(city);
	}
}

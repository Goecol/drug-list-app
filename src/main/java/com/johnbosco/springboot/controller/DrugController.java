package com.johnbosco.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.johnbosco.springboot.entity.Drug;
import com.johnbosco.springboot.repository.DrugRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("todo/")
public class DrugController {
	
	
	@Autowired
	private DrugRepository drugRepository;
	
	@GetMapping("drugs")
    public List<Drug> getDrugs(){
    	return this.drugRepository.findAll();
    }
}

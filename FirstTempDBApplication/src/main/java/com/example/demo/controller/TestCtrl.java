package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Register;
import com.example.demo.service.RegisterService;

@RestController
public class TestCtrl {
	@Autowired
	RegisterService regService;
	@PostMapping(value="/save")
	public String register(@RequestBody Register reg) {
		
		boolean b=regService.isRegister(reg);
		if(b) {
			return "Record save in database";
		}
		else
		{
			return "some problem is there.....";
		}
		
	}

}

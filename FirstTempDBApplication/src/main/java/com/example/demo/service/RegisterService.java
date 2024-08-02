package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Register;
import com.example.demo.repository.RegisterRepo;

@Service("regService")
public class RegisterService {
	@Autowired
	RegisterRepo registerRepo;
	
	public boolean isRegister(Register register) {
		return registerRepo.save(register)!=null? true:false;
		}
}
	
	



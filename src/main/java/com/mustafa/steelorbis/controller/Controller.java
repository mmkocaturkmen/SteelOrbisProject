package com.mustafa.steelorbis.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.steelorbis.dto.SteelOrbisUsersDto;
import com.mustafa.steelorbis.entity.SteelOrbisUsers;
import com.mustafa.steelorbis.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class Controller {

	@Autowired
	private UserRepository userRepository;
	
	
	 @GetMapping("/userList")
	 public ArrayList<SteelOrbisUsers> userList() {
		return (ArrayList<SteelOrbisUsers>) userRepository.findAll();
	}
	 
	 @PostMapping("/userLogin")
	 public ResponseEntity<Object> userByNamePassword( @RequestBody SteelOrbisUsersDto person) {
		 
		
		 SteelOrbisUsers result = userRepository.findByUserNameAndPassword(person.getUserName(), person.getPassword());
		 
		 if(result != null )
		 {
			 return	ResponseEntity.ok(true);
		 }else {
			 return ResponseEntity.ok(false);
		 }
		 
	}
	
	 @GetMapping("/userLogin/{userName}/{password}")
	 public ResponseEntity<Object> userByNamePassword2(@PathVariable String userName, @PathVariable String password) {
		 
		
		 SteelOrbisUsers result = userRepository.findByUserNameAndPassword(userName, password);
		 
		 if(result != null )
		 {
			 return	ResponseEntity.ok(true);
		 }else {
			 return ResponseEntity.ok(false);
		 }
		 
	}
	 
	
	
	
}

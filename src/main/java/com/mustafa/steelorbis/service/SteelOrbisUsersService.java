package com.mustafa.steelorbis.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mustafa.steelorbis.entity.SteelOrbisUsers;


public interface SteelOrbisUsersService {
	
	public ArrayList<SteelOrbisUsers> getUserListAll();
	public SteelOrbisUsers getUserByUserNamePassword(String userName, String password);
	
	

}

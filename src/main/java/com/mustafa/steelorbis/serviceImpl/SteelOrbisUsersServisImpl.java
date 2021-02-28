package com.mustafa.steelorbis.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafa.steelorbis.entity.SteelOrbisUsers;
import com.mustafa.steelorbis.repository.UserRepository;
import com.mustafa.steelorbis.service.SteelOrbisUsersService;

@Service
public class SteelOrbisUsersServisImpl implements SteelOrbisUsersService {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public ArrayList<SteelOrbisUsers> getUserListAll() {
		return (ArrayList<SteelOrbisUsers>) userRepository.findAll();
	}

	@Override
	public SteelOrbisUsers getUserByUserNamePassword(String userName, String password) {
		SteelOrbisUsers result = userRepository.findByUserNameAndPassword(userName, password);
		return result;
	}

	

}

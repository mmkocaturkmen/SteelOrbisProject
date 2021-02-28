package com.mustafa.steelorbis.repository;

import org.springframework.data.repository.CrudRepository;

import com.mustafa.steelorbis.entity.SteelOrbisUsers;


public interface UserRepository  extends CrudRepository<SteelOrbisUsers,Integer> {
	
	public SteelOrbisUsers findByUserNameAndPassword(String userName , String password);

}

package com.tiang.springmsql.api;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UseEntity, Integer> {

	List<UseEntity> findAll();
	}

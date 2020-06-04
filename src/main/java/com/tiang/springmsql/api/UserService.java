package com.tiang.springmsql.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
@Autowired
UserRepository userRepository;

	public List<UseEntity> getUser() {
		List<UseEntity> users=userRepository.findAll();
		System.out.println("users==="+users);
		return users;
	}

	public void getAddUser( UseEntity useEntity) {
		// TODO Auto-generated method stub
		userRepository.save(useEntity);
	}
	
	public UseEntity getUseById(int id) {
		 // return (Topic) topics.stream().filter(t->t.getName().equals(id)).findFirst().get();
	 
	      return userRepository.findById(id).orElse(null);
	  }

	public  void  deleteUser( int id)  {
		Optional<UseEntity>userEnity= userRepository.findById(id);
		
		if(userEnity.isPresent()) {
			userRepository.delete(userEnity.get());
			
			
		}else {
			throw new  RuntimeException(  "user not found for id:" +id);
		}
		
	}

	
     public void updateUserEntity(UseEntity userEntity) {
    	 userRepository.save(userEntity);
		
		
	}

	
}


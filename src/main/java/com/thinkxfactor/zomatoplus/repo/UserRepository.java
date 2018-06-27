package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.User;

public interface UserRepository extends JpaRepository <User,Long>{
	 User findByNameAndPassword(String name,String password);

}

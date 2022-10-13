package com.adh.AadharRestApi.Repository;

import org.springframework.data.repository.CrudRepository;

import com.adh.AadharRestApi.Entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}

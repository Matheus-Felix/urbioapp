package com.urbioapp.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.urbioapp.api.models.User;

public interface UrbioappRepository extends CrudRepository<User, String>{

}

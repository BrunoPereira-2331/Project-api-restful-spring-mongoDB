package com.bruno.ProjectApiRestful.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bruno.ProjectApiRestful.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}

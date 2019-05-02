package com.marcosaragao.postmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcosaragao.postmanager.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

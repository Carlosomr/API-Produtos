package com.carlos.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.produtos.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
    
}

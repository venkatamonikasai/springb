package com.springboot.demo.repository;

import com.springboot.demo.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author , Integer> {
    
}
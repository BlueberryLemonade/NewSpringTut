package com.example.cruddemo.repository;

import com.example.cruddemo.model.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {
}

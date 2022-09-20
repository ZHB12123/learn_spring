package com.example.demo.dao;

import com.example.demo.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetDao extends JpaRepository<Pet,Integer> {

}

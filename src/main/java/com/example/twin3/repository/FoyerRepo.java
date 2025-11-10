package com.example.twin3.repository;

import com.example.twin3.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoyerRepo extends JpaRepository<Foyer, Long> {

}

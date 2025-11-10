package com.example.twin3.repository;

import com.example.twin3.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepo extends JpaRepository<Universite,Long> {
    Universite findUniversiteByNomUniversite(String nomUniversite);
}

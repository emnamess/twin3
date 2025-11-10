package com.example.twin3.service;

import com.example.twin3.entity.Foyer;
import com.example.twin3.entity.Universite;
import com.example.twin3.repository.BlocRepo;
import com.example.twin3.repository.FoyerRepo;
import com.example.twin3.repository.UniversiteRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversiteService implements UniversiteInterface {

    FoyerRepo foyerRepo;
    UniversiteRepo universiteRepo;

    public UniversiteService(UniversiteRepo universiteRepo, FoyerRepo foyerRepo) {
        this.universiteRepo = universiteRepo;
        this.foyerRepo = foyerRepo;
    }

    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {
        Universite universite = universiteRepo.findUniversiteByNomUniversite(nomUniversite);
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        return null;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(Long idFoyer) {
        return null;
    }
}

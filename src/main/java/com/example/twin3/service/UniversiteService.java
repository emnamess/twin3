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
        //recherche et récupération
        Universite universite = universiteRepo.findUniversiteByNomUniversite(nomUniversite);
        Foyer foyer = foyerRepo.findById(idFoyer).orElse(null);
        //assign parent.setFils()
        universite.setFoyer(foyer);
        //persistence
        return universiteRepo.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(Long idUniversite) {
        //recherche et récupération
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        universite.setFoyer(null);
        return universiteRepo.save(universite);

    }
}

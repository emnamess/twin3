package com.example.twin3.controller;

import com.example.twin3.entity.Universite;
import com.example.twin3.service.UniversiteInterface;
import com.example.twin3.service.UniversiteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UniversiteController {
    UniversiteInterface universiteInterface;
    public UniversiteController(UniversiteService universiteService) {
    this.universiteInterface = universiteService;
    }
      @PutMapping("/universite/{id_foyer}/{nom_universite}")
      public Universite affecterFoyerAuniversite(@PathVariable("id_foyer") Long idFoyer, @PathVariable("nom_universite") String nomUniversite) {
            return universiteInterface.affecterFoyerAUniversite(idFoyer, nomUniversite);
      }
    @PutMapping("/universite/{id_universite}")
    public Universite desaffecterFoyerAuniversite(@PathVariable("id_universite") Long idUniversite) {
        return universiteInterface.desaffecterFoyerAUniversite(idUniversite);
    }
}

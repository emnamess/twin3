package com.example.twin3.service;

import com.example.twin3.entity.Bloc;
import com.example.twin3.entity.Universite;

import java.util.List;

public interface UniversiteInterface {
  public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite);
  public Universite desaffecterFoyerAUniversite(Long idFoyer);
}

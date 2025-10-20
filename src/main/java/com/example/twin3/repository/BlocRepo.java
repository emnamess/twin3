package com.example.twin3.repository;

import com.example.twin3.controller.BlocRestController;
import com.example.twin3.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepo extends JpaRepository<Bloc, Long> {
    @Query(value = "SELECT * FROM bloc WHERE nombloc = nom", nativeQuery = true)
    Bloc ByNomBloc(@Param("nom") String nom);
    @Query("SELECT b FROM Bloc b WHERE b.nomBloc = :nom")
    Bloc ByNomBloc2(@Param("nom") String nom);


    List<Bloc> findByFoyerUniversiteNomUniversite(String nom);

}

package com.example.twin3.repository;

import com.example.twin3.controller.BlocRestController;
import com.example.twin3.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepo extends JpaRepository<Bloc, Long> {
    @Query(value = "SELECT * FROM bloc WHERE nombloc = nom", nativeQuery = true)
    Bloc ByNomBloc(String nom);
}

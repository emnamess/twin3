package com.example.twin3.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estvalide;
    @ManyToMany(mappedBy = "reservations")
    Set<Etudiant> etudiantSet;
    @ManyToOne
    Chambre chambre;

}

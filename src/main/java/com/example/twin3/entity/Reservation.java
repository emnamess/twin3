package com.example.twin3.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    String idReservation;
    Date anneeUniversitaire;
    boolean estvalide;
    @ManyToMany(mappedBy = "reservations")
    Set<Etudiant> etudiantSet;

}

package com.example.twin3.service;

import com.example.twin3.entity.Bloc;

import java.util.List;

public interface BlocInterface {
    Bloc addBloc(Bloc bloc);
    Bloc UpdateBloc(Bloc bloc);
    Void DeleteBloc(Long idBloc);
    Bloc ViewBloc(Long idBloc);
    List<Bloc> ViewAllBlocs();
}

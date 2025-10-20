package com.example.twin3.service;

import com.example.twin3.entity.Bloc;
import com.example.twin3.repository.BlocRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocService implements BlocInterface {
    BlocRepo blocRepo;

    public BlocService(BlocRepo blocRepo) {
        this.blocRepo = blocRepo;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Void DeleteBloc(Long idBloc) {
        return  null;
    }


    @Override
    public Bloc ViewBloc(Long idBloc) {
        return blocRepo.findById(idBloc).get();
    }

    @Override
    public List<Bloc> ViewAllBlocs() {
        return blocRepo.findAll();
    }


}

package com.example.twin3.service;

import com.example.twin3.entity.Bloc;
import com.example.twin3.repository.BlocRepo;
import org.springframework.stereotype.Service;

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
}

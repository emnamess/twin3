package com.example.twin3.controller;

import com.example.twin3.entity.Bloc;
import com.example.twin3.service.BlocInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocRestController {
    BlocInterface blocInterface;

    public BlocRestController(BlocInterface blocInterface) {
        this.blocInterface = blocInterface;
    }

    @PostMapping("/bloc")
    Bloc addBloc(Bloc bloc) {
        return blocInterface.addBloc(bloc);
    }
}

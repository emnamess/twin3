package com.example.twin3.controller;

import com.example.twin3.entity.Bloc;
import com.example.twin3.service.BlocInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlocRestController {
    BlocInterface blocInterface;

    public BlocRestController(BlocInterface blocInterface) {
        this.blocInterface = blocInterface;
    }

    @PostMapping("/bloc")
    Bloc addBloc(@RequestBody Bloc bloc) {
        return blocInterface.addBloc(bloc);

    }
    @PutMapping("/updatebloc")
    Bloc UpdateBloc(@RequestBody Bloc bloc) {
        return blocInterface.UpdateBloc(bloc);
    }
    @DeleteMapping("/delete/{id_bloc}")
    Bloc DeleteBloc(@RequestBody Bloc bloc) {
        return null;
    }
    @GetMapping("/get/{id_bloc}")
    Bloc GetBloc(@PathVariable("id_bloc")Long id_bloc) {
        return blocInterface.ViewBloc(id_bloc);
    }
    @GetMapping("/getAll")
    List<Bloc> GetAllBloc() {
        return blocInterface.ViewAllBlocs();
    }
}

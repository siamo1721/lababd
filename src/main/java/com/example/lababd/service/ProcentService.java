package com.example.lababd.service;

import com.example.lababd.model.Procent;

import java.util.List;

public interface ProcentService {


    List<Procent> getAllProcents();

    Procent addProcent(Procent procent);

    Procent getProcentById(int id);
    Procent saveProcent(Procent procent);
    void deleteProcent(int id);

}

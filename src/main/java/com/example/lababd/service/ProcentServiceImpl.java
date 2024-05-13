package com.example.lababd.service;

import com.example.lababd.model.Procent;
import com.example.lababd.repository.ProcentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProcentServiceImpl implements ProcentService {
    private final ProcentRepository procentRepository;

    @Override
    public List<Procent> getAllProcents() {
        return procentRepository.findAll();
    }


    @Override
    public Procent addProcent(Procent procent) {
        return procentRepository.save(procent);
    }

    @Override
    public Procent getProcentById(int id) {
        return procentRepository.findById(id).orElse(null);
    }

    @Override
    public Procent saveProcent(Procent procent) {
        return procentRepository.save(procent);
    }

    @Override
    public void deleteProcent(int id) {
        procentRepository.deleteById(id);
    }
}


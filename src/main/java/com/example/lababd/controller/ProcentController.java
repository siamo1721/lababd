package com.example.lababd.controller;

import com.example.lababd.model.Procent;
import com.example.lababd.service.ProcentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/procent")
public class ProcentController {
    @Autowired
    private ProcentService procentService;

    @GetMapping("/{id}")
    public Procent getProcentById(@PathVariable Integer id) {

        return procentService.getProcentById(id);
    }

    @PostMapping("/add")
    public Procent addProcent(@RequestBody Procent procent) {

        return procentService.addProcent(procent);
    }
    @GetMapping("/all")
    public List<Procent> getAllProcent() {

        return procentService.getAllProcents();
    }

    @DeleteMapping("/{id}")
    public void deleteProcent(@PathVariable Integer id) {

        procentService.deleteProcent(id);
    }

}



package com.example.lababd.controller;

import com.example.lababd.service.DeloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/delo")
public class DeloController {

    private final DeloService deloService;

    public DeloController(DeloService deloService) {
        this.deloService = deloService;
    }
    @GetMapping("/{idDelo}")
    public ResponseEntity<Map<String, Object>> getPatientInfoByDeloId(@PathVariable Integer idDelo) {
        Map<String, Object> patientInfo = deloService.findPatientInfoByDeloId(idDelo);
        if (patientInfo != null && !patientInfo.isEmpty()) {
            return ResponseEntity.ok(patientInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}


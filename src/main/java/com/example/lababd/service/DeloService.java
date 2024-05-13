package com.example.lababd.service;

import com.example.lababd.repository.DeloRepository;

import java.util.Map;

public interface DeloService {

    Map<String, Object> findPatientInfoByDeloId(Integer idDelo);
}

package com.example.lababd.service;

import com.example.lababd.repository.DeloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class DeloServiceImpl implements DeloService{
    private final DeloRepository deloRepository;
    @Override
    public Map<String, Object> findPatientInfoByDeloId(Integer idDelo) {
        return deloRepository.findPatientInfoByDeloId(idDelo);
    }
}

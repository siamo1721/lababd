package com.example.lababd.repository;
import com.example.lababd.model.Procent;
import com.example.lababd.model.Delo;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface DeloRepository extends JpaRepository<Delo, Integer> {
    @Query("SELECT d.idDelo AS idDelo, p.surname AS patientSurname, p.idProcent AS patientId " +
            "FROM Delo d JOIN d.procent p WHERE d.idDelo = :idDelo")
    Map<String, Object> findPatientInfoByDeloId(@Param("idDelo") Integer idDelo);
}

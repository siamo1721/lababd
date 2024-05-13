package com.example.lababd.repository;

import com.example.lababd.model.Procent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.List;
import java.util.Optional;

@Repository
public interface ProcentRepository extends JpaRepository<Procent, Integer> {
    Optional<Procent> findById(Integer id);
    List<Procent> findBySurname(String surname);



}

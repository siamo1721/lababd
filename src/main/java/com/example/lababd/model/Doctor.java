package com.example.lababd.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "doctor")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private Integer idDoctor;

    private String surname;

    private String namee;

    @Column(name = "surname1")
    private String surname1;

    private String sex;

    @Column(name = "DOB")
    private Date dob;

    private String numberphone;

    private String specialization;
}

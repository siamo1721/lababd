package com.example.lababd.model;


import lombok.*;
import jakarta.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "procent")
public class Procent {
    @Id
    @Column(name = "id_procent")
    private Integer idProcent;

    private String surname;

    private String namee;

    @Column(name = "surname1")
    private String surname1;

    private String sex;

    @Column(name = "DOB")
    private Date dob;

    private String pasport;

    private String address;

    private String numberphone;

    private String polis;
}

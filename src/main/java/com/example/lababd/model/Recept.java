package com.example.lababd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "recept")
public class Recept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Recept")
    private Integer idRecept;

    @ManyToOne
    @JoinColumn(name = "id_reception")
    private Reception reception;

    private String hilki;

    private String sposob;

    private String dozirovka;
}

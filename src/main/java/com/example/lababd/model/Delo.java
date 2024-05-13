package com.example.lababd.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "delo")
public class Delo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_delo")
    private Long idDelo;

    @ManyToOne
    @JoinColumn(name = "id_procent")
    private Procent procent;
}

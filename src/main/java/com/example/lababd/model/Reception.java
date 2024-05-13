package com.example.lababd.model;
import jakarta.persistence.*;
import lombok.*;

import java.security.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "reception")
public class Reception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reception")
    private Integer idReception;

    @ManyToOne
    @JoinColumn(name = "id_procent")
    private Procent procent;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "id_place")
    private Place place;

    @Column(name = "timee")
    private Timestamp time;

    @Column(name = "datee")
    private Date date;

    private String diagnoz;

    private String symprom;

}

package com.example.lababd.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@Table(name = "oplata")
public class Oplata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oplata")
    private Integer idOplata;
    @ManyToOne
    @JoinColumn(name = "id_reception")
    private Reception reception;

    private BigDecimal summ;

    @Column(name = "datee")
    private Date date;

}

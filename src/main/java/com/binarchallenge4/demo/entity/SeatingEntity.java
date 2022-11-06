package com.binarchallenge4.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "Kursi")
public class SeatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kode_kursi")
    private long kodeKursi;
    @Column(name = "nomor_kursi")
    private String nomorKursi;
    @Column(name = "cinema_id")
    private String cinemaId;

}

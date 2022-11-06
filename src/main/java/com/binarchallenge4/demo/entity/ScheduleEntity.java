package com.binarchallenge4.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "Jadwal")
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jadwal_id")
    private long jadwalId;
    @Column(name = "kode_film")
    private String kodeFilm;
    @Column(name = "tanggal_rilis")
    private String tanggalRilis;
    @Column(name = "jam_mulai")
    private String jamMulai;
    @Column(name = "jam_akhir")
    private String jamAkhir;
    @Column(name = "harga_tiket")
    private String hargaTiket;


}

package com.binarchallenge4.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "Reservasi")
public class ReservesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservasi")
    private long idReservasi;
    @Column(name = "harga")
    private long harga;
    @Column(name = "kode_kursi")
    private String kodeKursi;
    @Column(name = "jadwal_id")
    private String jadwalId;
    @Column(name = "cinema_id")
    private String cinemaId;
}

package com.binarchallenge4.demo.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "Pesanan")
public class PesananEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pesanan")
    private long idPesanan;
    @Column(name = "jumlah_kursi")
    private String jumlahKursi;
    @Column(name = "kode_kursi")
    private String kodeKursi;
    @Column(name = "cinema_id")
    private String cinemaId;
}

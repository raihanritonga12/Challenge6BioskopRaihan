package com.binarchallenge4.demo.service;

import com.binarchallenge4.demo.entity.FilmEntity;

import java.util.List;
import java.util.Optional;

public interface FilmService {



    List<FilmEntity> cariSemuaFilm();
    Optional<FilmEntity> cariDariID(Long id);
    FilmEntity simpanFilm(FilmEntity filmEntity);
    FilmEntity updateFilm(Long id, FilmEntity filmEntity);
    String deleteFilm(Long id);
}

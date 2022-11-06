package com.binarchallenge4.demo.controller;


import com.binarchallenge4.demo.entity.FilmEntity;
import com.binarchallenge4.demo.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;

    @PostMapping("/buat")
    @ResponseStatus(HttpStatus.CREATED)
    public FilmEntity create(@RequestBody FilmEntity film){
        return filmService.simpanFilm(film);
    }
    @GetMapping("/ambilSemua")
    public List<FilmEntity> getall(){
        return filmService.cariSemuaFilm();
    }
    @PutMapping("/perbaharui/{id}")
    public FilmEntity update(@PathVariable Long id, @RequestBody FilmEntity film){
        return filmService.updateFilm(id,film);
    }
    @DeleteMapping("/hapus/{id}")
    public String delete(@PathVariable Long id){
        return filmService.deleteFilm(id);
    }


    @GetMapping("/test")
    public String testEndpoint(){
        return "test";
    }


}

package com.binarchallenge4.demo.repository;

import com.binarchallenge4.demo.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity,Long>{
}

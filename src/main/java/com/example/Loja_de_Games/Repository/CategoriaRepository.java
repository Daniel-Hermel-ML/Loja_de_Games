package com.example.Loja_de_Games.repository;

import com.example.Loja_de_Games.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String nome);
}
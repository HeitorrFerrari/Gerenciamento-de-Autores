package com.example.GerenciamentoAutores.Repositorie;

import Models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepositorie extends JpaRepository<AutorModel, Long> {
}

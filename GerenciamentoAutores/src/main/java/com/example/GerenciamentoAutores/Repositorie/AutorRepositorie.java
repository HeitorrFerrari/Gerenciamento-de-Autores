package com.example.GerenciamentoAutores.Repositorie;

import com.example.GerenciamentoAutores.Models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepositorie extends JpaRepository<AutorModel,Long> {
}

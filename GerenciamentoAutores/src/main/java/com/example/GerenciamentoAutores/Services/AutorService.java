package com.example.GerenciamentoAutores.Services;

import com.example.GerenciamentoAutores.Models.AutorModel;
import com.example.GerenciamentoAutores.Repositorie.AutorRepositorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    private AutorRepositorie autorRepositorie;

    public AutorModel criarAutor(AutorModel autorModel) {
        return autorRepositorie.save(autorModel);
    }

    public List<AutorModel> buscarAutor (AutorModel autorModel) {
        return autorRepositorie.findAll();
    }

}

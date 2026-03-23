package com.example.GerenciamentoAutores.Services;

import com.example.GerenciamentoAutores.Models.AutorModel;
import com.example.GerenciamentoAutores.Repositorie.AutorRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorie autorRepositorie;

    public AutorModel criarAutor(AutorModel autorModel) {
        return autorRepositorie.save(autorModel);
    }

    public List<AutorModel> buscarAutor () {
        return autorRepositorie.findAll();
    }

    public void removerAutor (Long id) {
        autorRepositorie.deleteById(id);
    }

    public Optional<AutorModel> buscarPorId (Long id) {
        return autorRepositorie.findById(id);
    }

}

package com.example.GerenciamentoAutores.Controller;

import com.example.GerenciamentoAutores.Models.AutorModel;
import com.example.GerenciamentoAutores.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/autores")

public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorModel> criarAluno(@RequestBody AutorModel produtoModel) {

        AutorModel request = autorService.criarAutor(produtoModel);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(produtoModel.getId())
                .toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> buscarAutores () {
        List<AutorModel> request = autorService.buscarAutor();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<AutorModel>> buscarPorId(@PathVariable Long id) {
        Optional<AutorModel> request = autorService.buscarPorId(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deletarProduto (@PathVariable Long id) {
        autorService.removerAutor(id);

        return ResponseEntity.noContent().build();
    }
}

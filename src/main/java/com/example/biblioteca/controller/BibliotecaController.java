package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BibliotecaController {
    List<Livro> livros = new ArrayList<>();

    public BibliotecaController() {
        livros.add(new Livro(1, "Jogos Vorazes", "Suzanne Collins", "Distopia / Ficção científica", 2008, 11));
        livros.add(new Livro(2, "Em Chamas", "Suzanne Collins", "Distopia / Ficção científica", 2009, 0));
        livros.add(new Livro(3, "A Esperança", "Suzanne Collins", "Distopia / Ficção científica", 2010, 4));
        livros.add(new Livro(4, "A Cantiga dos Pássaros e das Serpentes", "Suzanne Collins", "Distopia / Ficção científica", 2020, 8));
    }

    @PostMapping("/cadastrar-novo-livro")
    public Livro cadastrarNovoLivro(@RequestBody Livro livro) {
        livros.add(livro);
        return livro;
    }

    @GetMapping("/todos-os-livros-cadastrados")
    public List<Livro> obterTodosLivrosCadastrados() {
        return livros;
    }

    @GetMapping("/livros-disponiveis")
    public List<Livro> obterSomenteLivrosUnidadesDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getQtdDisponivel() > 0) {
                livrosDisponiveis.add(livro);
            }
        }

        return livrosDisponiveis;
    }

    @GetMapping("/quantidade-total-de-livros-cadastrados")
    public int obterQtdTotalLivrosCadastrados() {
        return livros.size();
    }
}

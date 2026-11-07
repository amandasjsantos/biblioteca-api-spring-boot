package com.example.biblioteca.model;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private String genero;
    private int anoDePublicacao;
    private int qtdDisponivel;

    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: " + titulo + " | Autor: " + autor + " | Gênero: " + genero + " | Ano de publicação: " + anoDePublicacao + " | Quantidade disponível: " + qtdDisponivel;
    }

    public Livro(int codigo, String titulo, String autor, String genero, int anoDePublicacao, int qtdDisponivel) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoDePublicacao = anoDePublicacao;
        this.qtdDisponivel = qtdDisponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
}

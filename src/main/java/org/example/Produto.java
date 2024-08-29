package org.example;

public class Produto implements Item {

    private int codigo;
    private String nome;
    private Categoria categoria;

    public Produto(int codigo, String nome, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProduto(this);
    }
}

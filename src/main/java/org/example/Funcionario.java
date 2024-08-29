package org.example;

public class Funcionario implements Item {

    private int codigo;
    private String nome;
    private float salario;

    public Funcionario(int codigo, String nome, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFuncionario(this);
    }
}


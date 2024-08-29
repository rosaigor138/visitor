package org.example;

public class LojaVisitor implements Visitor {

    public String exibir(Item item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirProduto(Produto produto) {
        return "Produto{" +
                "codigo=" + produto.getCodigo() +
                ", nome='" + produto.getNome() + '\'' +
                ", categoria=" + produto.getNomeCategoria() +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}


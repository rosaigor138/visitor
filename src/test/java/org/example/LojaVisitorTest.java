package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaVisitorTest {

    @Test
    void deveExibirProduto() {
        Categoria categoria = new Categoria("Eletrônicos");
        Produto produto = new Produto(1, "Smartphone", categoria);

        LojaVisitor visitor = new LojaVisitor();
        assertEquals("Produto{codigo=1, nome='Smartphone', categoria=Eletrônicos}", visitor.exibir(produto));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Carlos", 3000.0f);

        LojaVisitor visitor = new LojaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Carlos', salario=3000.0}", visitor.exibir(funcionario));
    }
}

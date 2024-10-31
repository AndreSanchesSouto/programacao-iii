package service;

import java.util.List;
import entity.Produto;
import estrategy.DescontoStrategy;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotalComDesconto() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += descontoStrategy.calcularDesconto(produto.getPrecoBase());
        }
        return total;
    }
}
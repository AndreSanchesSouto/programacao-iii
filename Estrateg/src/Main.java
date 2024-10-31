import entity.Produto;
import estrategy.DescontoClienteNovo;
import estrategy.DescontoClienteRegular;
import estrategy.DescontoClienteVip;
import service.CarrinhoDeCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(new Produto("Sardinha", 10.00));
        carrinho.adicionarProduto( new Produto("Picanha", 32.50));
        carrinho.adicionarProduto(new Produto("Nescau", 12.30));

        System.out.print("Cliente Novo: ");
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("R$" + carrinho.calcularTotalComDesconto());

        System.out.print("Cliente Regular: ");
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("R$" + carrinho.calcularTotalComDesconto());

        System.out.print("Cliente VIP: ");
        carrinho.setDescontoStrategy(new DescontoClienteVip());
        System.out.println("R$" + carrinho.calcularTotalComDesconto());
    }
}

import pizza.builder.PizzaBuilder;
import pizza.entities.Pizza;
import relatorio.builder.RelatorioBuilder;
import relatorio.entities.Relatorio;
import veiculo.builder.VeiculoBuilder;
import veiculo.entities.Veiculo;

public class Main {
    public static void main(String[] args) {
        pizza();

        veiculo();

        relatorio();
    }

    static void pizza() {
        System.out.println("--Pizza builder--");
        Pizza pizzaBacon = new PizzaBuilder()
                .setTamanho("1 metro")
                .setMassa("Italiana")
                .addIngredientes("Bacon, Queijo e Frango")
                .build();

        System.out.println(pizzaBacon + "\n");
    }

    static void veiculo() {
        System.out.println("--Veiculo builder--");
        Veiculo motoAzul = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Azul")
                .setRodas(2)
                .build();

        System.out.println(motoAzul + "\n");

        Veiculo carroVermelho = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Vermelho")
                .setRodas(4)
                .build();

        System.out.println(carroVermelho + "\n");
    }

    static void relatorio() {
        System.out.println("--Relatorio builder--");
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Texto legal")
                .setCorpo("""
                        Hoje vou falar sobre o texto 'Título Super Legal', que aborda de maneira envolvente e criativa um tema cotidiano.
                        Através de uma linguagem acessível e reflexiva, o autor nos convida a pensar sobre questões simples do dia a dia,\s
                        enquanto explora o assunto de forma lógica e bem estruturada. O texto combina argumentação com exemplos práticos,\s
                        facilitando a compreensão e mantendo o leitor atento ao longo da leitura.""")
                .setRodape("Espero que tenham gostado")
                .build();

        System.out.println(relatorio + "\n");


    }

}
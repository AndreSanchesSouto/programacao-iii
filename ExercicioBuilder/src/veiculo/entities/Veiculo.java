package veiculo.entities;

public class Veiculo {

    private String tipo = "";
    private String cor = "";
    private Integer rodas = 0;

    public Veiculo() {}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + '\n' +
                "Cor: " + cor + '\n' +
                "Rodas: " + rodas;
    }
}

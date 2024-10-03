package relatorio.entities;

public class Relatorio {

    String titulo = "";
    String corpo = "";
    String rodape = "";

    public Relatorio(){}

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return  titulo + '\n' +
                corpo + '\n' +
                rodape + '\n';
    }
}

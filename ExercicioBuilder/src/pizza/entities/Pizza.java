package pizza.entities;

public class Pizza {

    private String massa = "";
    private String tamanho = "";
    private String ingredientes = "";

    public Pizza() {}

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }


    @Override
    public String toString() {
        return "Massa: " + this.massa + "\n" +
                "Tamanho: " + this.tamanho + "\n" +
                "Ingredientes: " + this.ingredientes;
    }

}

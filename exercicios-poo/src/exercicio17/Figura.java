package exercicio17;

public abstract class Figura {
    
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract double area();

    public abstract String toString();

}

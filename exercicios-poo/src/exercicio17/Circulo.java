package exercicio17;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio, String cor) {
        this.setCor(cor);
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return 2 * raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "[Círculo] Raio: " + raio;
    }

}

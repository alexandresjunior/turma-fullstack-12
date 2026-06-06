package exercicio17;

public class Quadrado extends Retangulo {

    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    @Override
    public String toString() {
        return "[Quadrado] Lado: " + getLado1();
    }

}

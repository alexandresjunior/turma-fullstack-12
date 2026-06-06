package exercicio01;

public class App01 {

    public static void main(String[] args) {
        Transporte caminhao = new Transporte();

        caminhao.setAno(2024);
        caminhao.setCargaMaxima(5000.0);
        caminhao.setPotencia(250.0);

        System.out.println("Consumo: " + caminhao.calcularConsumo());
    }

}

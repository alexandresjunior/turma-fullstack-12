package exercicio02;

import java.time.LocalDate;

public class App02 {
    
    public static void main(String[] args) {
        Produto iogurte = new Produto();

        iogurte.setNome("Iogurte Zero");
        iogurte.setValidade(LocalDate.of(2026, 5, 25));

        System.out.println("Faltam " + iogurte.calcularDiasRestantes() + " dias para vencer.");
    }

}

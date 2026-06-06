package extra;

public class TestarAnimais {
    
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, 4, 
            "Amarelo", "Terra", 2, "Cacto");

        Peixe tubarao = new Peixe("Tubarão", 300, 0, 
            "Cinzento", "Mar", 1.5f, "Barbatanas e Cauda");
    
        Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 180, 4,
            "Vermelho", "Terra", 0.5f, "Mel");

        camelo.dadosMamifero();
        tubarao.dadosPeixe();
        ursoCanada.dadosMamifero();
    }

}

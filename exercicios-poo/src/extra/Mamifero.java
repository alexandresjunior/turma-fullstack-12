package extra;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroPatas, 
            String cor, String ambiente, float velocidadeMedia,
            String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamifero() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
    
}

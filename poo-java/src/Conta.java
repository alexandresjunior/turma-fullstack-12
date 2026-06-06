public abstract class Conta implements Repositorio {

    private int idBanco;
    private int idAgencia;
    private int idConta;
    private char digito;
    private double saldo;
    private Usuario titular;

    public Conta(int idBanco, int idAgencia) {
        this.idBanco = idBanco;
        this.idAgencia = idAgencia;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public char getDigito() {
        return digito;
    }

    public void setDigito(char digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDetalhes() {
        System.out.println("CONTA -------");
        System.out.println("BANCO: " + idBanco);
        System.out.println("AGÊNCIA: " + idAgencia);
        System.out.println("CONTA: " + idConta + "-" + digito);
        System.out.println("SALDO ATUAL: " + saldo);
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    public abstract void cadastrarConta();

}

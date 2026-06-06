public class ContaPoupanca extends Conta {

    private Double taxaRendimento;

    public ContaPoupanca(int idBanco, int idAgencia, Double taxaRendimento) {
        super(idBanco, idAgencia);
        this.taxaRendimento = taxaRendimento;
    }

    public Double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void cadastrarConta() {
        System.out.println("Conta POUPANCA cadastrada com sucesso!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("TAXA DE RENDIMENTO: " + taxaRendimento);
    }

    @Override
    public void cadastrar() {
        System.out.println("Conta POUPANCA cadastrada com sucesso!");
    }

    @Override
    public void listar() {
        System.out.println("Lista de contas POUPANCAS");
    }

    @Override
    public void atualizar() {
        System.out.println("Conta POUPANCA atualizada com sucesso!");
    }

    @Override
    public void excluir() {
        System.out.println("Conta POUPANCA removida com sucesso!");
    }

}

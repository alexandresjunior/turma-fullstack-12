public class ContaCorrente extends Conta {

    private Double taxaServico;
    private boolean bloqueada;

    public ContaCorrente(int idBanco, int idAgencia, Double taxaServico) {
        super(idBanco, idAgencia);
        this.taxaServico = taxaServico;
    }

    public Double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public void cadastrarConta() {
        System.out.println("Conta CORRENTE cadastrada com sucesso!");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("TAXA DE SERVIÇO: " + taxaServico);
    }

    @Override
    public void cadastrar() {
        System.out.println("Conta CORRENTE cadastrada com sucesso!");
    }

    @Override
    public void listar() {
        System.out.println("Lista de contas CORRENTES");
    }

    @Override
    public void atualizar() {
        System.out.println("Conta CORRENTE atualizada com sucesso!");
    }

    @Override
    public void excluir() {
        System.out.println("Conta CORRENTE removida com sucesso!");
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

}

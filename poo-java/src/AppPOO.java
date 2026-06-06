import java.util.UUID;

public class AppPOO {

    public static void main(String[] args) {
        // Criação da instância (objeto) da classe Usuário
        Usuario usuario1 = new Usuario(1, "Alexandre", "123456789-00", "alexandre@treinarecife.com.br");
        Usuario usuario2 = new Usuario(7, "Paulo", "123456789-01", "paulo@treinarecife.com.br");
        
        Conta conta1 = new ContaCorrente(123, 1990, 0.05);
        Conta conta2 = new ContaPoupanca(123, 1990, 0.10);

        // Atribuindo um valor ao atributo
        usuario1.setSenha(UUID.randomUUID().toString());
        usuario2.setSenha(UUID.randomUUID().toString());
        
        conta1.setIdConta((int) (Math.random() * 1000));
        conta1.setDigito('X');
        conta1.setSaldo(0.0);
        conta1.setTitular(usuario1);
        
        conta2.setIdConta((int) (Math.random() * 1000));
        conta2.setIdConta('X');
        conta2.setSaldo(0.0);
        conta2.setTitular(usuario2);

        // Acessando o valor do atributo
        usuario1.exibirDetalhes();
        usuario2.exibirDetalhes();
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();

        // Instanciando uma conta corrente
        ContaCorrente cc = new ContaCorrente(1, 2, 0.10);
        cc.setTitular(usuario1);
        cc.setSaldo(0);

        cc.cadastrarConta();
        cc.exibirDetalhes();

        // Instanciando uma conta poupanca
        ContaPoupanca cp = new ContaPoupanca(1, 2, 0.15);
        cp.setDigito('Y');
        cp.setTitular(usuario2);
        cp.setSaldo(0);

        cp.cadastrarConta();
        cp.exibirDetalhes();

    }

}
import java.util.Scanner;

public class AppProcedural {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeUsuario1 = sc.nextLine();

        System.out.println("Digite seu email:");
        String emailUsuario1 = sc.nextLine();

        System.out.println("Digite seu cpf:");
        String cpfUsuario1 = sc.nextLine();

        // outros atributos de Usuário...
        
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("Criando conta bancária...");
        
        int idBancoConta1 = 123;
        int idAgenciaConta1 = 1990;
        int idConta1 = (int) (Math.random() * 1000);
        char digitoConta1 = 'X';
        double saldoConta1 = 0;
        
        System.out.println("Conta bancária criada com sucesso!");
        
        System.out.println("Exibindo detalhes:");
        System.out.println("USUÁRIO -------");
        System.out.println("NOME: " + nomeUsuario1);
        System.out.println("CPF: " + cpfUsuario1);
        System.out.println("EMAIL: " + emailUsuario1);
        System.out.println("CONTA -------");
        System.out.println("BANCO: " + idBancoConta1);
        System.out.println("AGÊNCIA: " + idAgenciaConta1);
        System.out.println("CONTA: " + idConta1 + "-" + digitoConta1);
        System.out.println("SALDO ATUAL: " + saldoConta1);

        System.out.println("------------------------");
        
        System.out.println("Digite seu nome:");
        String nomeUsuario2 = sc.nextLine();

        System.out.println("Digite seu email:");
        String emailUsuario2 = sc.nextLine();

        System.out.println("Digite seu cpf:");
        String cpfUsuario2 = sc.nextLine();

        // outros atributos de Usuário...

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("Criando conta bancária...");
        
        int idBancoConta2 = 123;
        int idAgenciaConta2 = 1990;
        int idConta2 = (int) (Math.random() * 1000);
        char digitoConta2 = 'X';
        double saldoConta2 = 0;
        
        System.out.println("Conta bancária criada com sucesso!");
        
        System.out.println("Exibindo detalhes:");
        System.out.println("USUÁRIO -------");
        System.out.println("NOME: " + nomeUsuario2);
        System.out.println("CPF: " + cpfUsuario2);
        System.out.println("EMAIL: " + emailUsuario2);
        System.out.println("CONTA -------");
        System.out.println("BANCO: " + idBancoConta2);
        System.out.println("AGÊNCIA: " + idAgenciaConta2);
        System.out.println("CONTA: " + idConta2 + "-" + digitoConta2);
        System.out.println("SALDO ATUAL: " + saldoConta2);

        sc.close();
    }
}

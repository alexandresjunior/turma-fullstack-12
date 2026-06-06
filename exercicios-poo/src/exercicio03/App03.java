package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class App03 {

    public static void main(String[] args) {
        // Instanciando os objetos turma e aluno
        Turma poo = new Turma();
        poo.setCod("POO");
        poo.setTurno(3);
        poo.setSala(3);

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula("123XYZ");

        Aluno aluno2 = new Aluno();
        aluno1.setMatricula("456XYZ");

        // Associando uma turma aos alunos
        aluno1.setTurma(poo);
        aluno2.setTurma(poo);

        // Associando os alunos a uma turma
        List<Aluno> lista = new ArrayList<>();
        lista.add(aluno1);
        lista.add(aluno2);

        poo.setAlunos(lista);
    }
    
}

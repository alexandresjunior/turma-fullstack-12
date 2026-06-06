public class App {
    public static void main(String[] args) throws Exception {
        Professor p = new Professor("Alexandre", "Full Stack");

        Curso c = new Curso("POO", 18, p);
        
        c.detalhesCurso();

        Curso c2 = new Curso();
        c2.setNome("Git e GitHub");
        c2.setCargaHoraria(6);

        c2.detalhesCurso();
    }
}

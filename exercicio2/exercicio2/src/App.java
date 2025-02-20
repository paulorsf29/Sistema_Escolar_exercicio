import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        
        Professor professor = new Professor("lucas", "escola", "lucas@escola.com");

        Diciplina disciplina = new Diciplina("matematica", 7.15, 1);

        Aluno aluno1 = new Aluno("jorge", 7986, 8.6, 4.6, 7.9, 9.4);
        Aluno aluno2 = new Aluno("lucas", 1233, 0, 0, 0, 0);
        Aluno aluno3 = new Aluno("pedro", 3411, 0, 0, 0, 0);
        Aluno aluno4 = new Aluno("luiz", 9875, 0, 0, 0, 0);
        Aluno aluno5 = new Aluno("maria", 6771, 0, 0, 0, 0);
        Aluno aluno6 = new Aluno("joao", 1998, 0, 0, 0, 0);

        System.out.println("A situação do aluno " + aluno1.getName() + " é: " + aluno1.situacaoAluno());
        System.out.println("A situação do aluno " + aluno2.getName() + " é: " + aluno2.situacaoAluno());
        System.out.println("A situação do aluno " + aluno3.getName() + " é: " + aluno3.situacaoAluno());
        System.out.println("A situação do aluno " + aluno4.getName() + " é: " + aluno4.situacaoAluno());
        System.out.println("A situação do aluno " + aluno5.getName() + " é: " + aluno5.situacaoAluno());
        System.out.println("A situação do aluno " + aluno6.getName() + " é: " + aluno6.situacaoAluno());

        System.out.println(disciplina.imprimirDiciplina());
        System.out.println(professor.imprimirProfessor());
        System.out.println(aluno1.imprimirAluno());
        System.out.println(aluno2.imprimirAluno());
        System.out.println(aluno3.imprimirAluno());
        System.out.println(aluno4.imprimirAluno());
        System.out.println(aluno5.imprimirAluno());
        System.out.println(aluno6.imprimirAluno());
    }
    
}

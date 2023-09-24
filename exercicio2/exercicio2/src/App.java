import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        
        Professor professor = new Professor("lucas", "ecola", "lucas@escola.com", new ArrayList<>());
        Diciplina disciplina = new Diciplina("matematica", 7.15, 1);
        Aluno aluno1 = new Aluno("jorge", 7986, 8.6, 4.6, 7.9, 9.4);
        Aluno aluno2 = new Aluno("lucas", 0, 0, 0, 0, 0);
        Aluno aluno3 = new Aluno("pedro", 0, 0, 0, 0, 0);
        Aluno aluno4 = new Aluno("luiz", 0, 0, 0, 0, 0);
        Aluno aluno5 = new Aluno("maria", 0, 0, 0, 0, 0);
        Aluno aluno6 = new Aluno("joao", 0, 0, 0, 0, 0);

        System.out.println(aluno1.mediaDoAluno(9, 8.9, 4.8, 3.6)+" e a situação do aluno é:"+aluno1.situacaoAluno());
        System.out.println(aluno2.mediaDoAluno(5, 9.9, 8.8, 9.6)+" e a situação do aluno é:"+aluno2.situacaoAluno());
        System.out.println(aluno2.mediaDoAluno(7, 6.9, 4.8, 8.6)+" e a situação do aluno é:"+aluno2.situacaoAluno());
        System.out.println(aluno2.mediaDoAluno(3, 4.9, 9.8, 7.6)+" e a situação do aluno é:"+aluno2.situacaoAluno());
        System.out.println(aluno2.mediaDoAluno(2, 2.9, 3.8, 6.6)+" e a situação do aluno é:"+aluno2.situacaoAluno());
        System.out.println(aluno2.mediaDoAluno(10, 7.9, 4.8, 10)+" e a situação do aluno é:"+aluno2.situacaoAluno());

        System.out.println(disciplina.imprimirDiciplinas());
        System.out.println(professor.imprimirProfessores());
        System.out.println(aluno1.imprimirAlunos());
        System.out.println(aluno2.imprimirAlunos());
        System.out.println(aluno3.imprimirAlunos());
        System.out.println(aluno4.imprimirAlunos());
        System.out.println(aluno5.imprimirAlunos());
        System.out.println(aluno6.imprimirAlunos());

        
    }
    
}

public class Aluno {
    private String nomeAluno;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    
    public Aluno(String nomeAluno, int matricula, double nota1, double nota2, double nota3, double nota4) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double mediaDoAluno (double nota1, double nota2, double nota3, double nota4){
        double media = (nota1+ nota2+ nota3+ nota4)/4;
        return media;
    }
    public String situacaoAluno(){
        double compararMedia = mediaDoAluno(nota1, nota2, nota3, nota4);
        if (compararMedia <=7) {
            return "aluno aprovado";
        } else {
            return "aluno reprovado";
        }
    }

    public String imprimirAlunos() {
        return "Aluno [nomeAluno=" + nomeAluno + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2
                + ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
    }
    
}

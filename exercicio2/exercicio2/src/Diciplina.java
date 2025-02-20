import java.util.ArrayList;
public class Diciplina {

    private String nomeDiciplina;
    private double horarioDiciplina;
    private int sala;

    public static ArrayList<Aluno> alunosDaDiciplina = new ArrayList<>();

    public Diciplina(String nomeDiciplina, double horarioDiciplina, int sala) {
        this.nomeDiciplina = nomeDiciplina;
        this.horarioDiciplina = horarioDiciplina;
        this.sala = sala;
        
    }
    public String getNomeDiciplina() {
        return nomeDiciplina;
    }
    public void setNomeDiciplina(String nomeDiciplina) {
        this.nomeDiciplina = nomeDiciplina;
    }
    public double getHorarioDiciplina() {
        return horarioDiciplina;
    }
    public void setHorarioDiciplina(double horarioDiciplina) {
        this.horarioDiciplina = horarioDiciplina;
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    public static ArrayList<Aluno> getAlunosDaDiciplina(){
        return alunosDaDiciplina;
    }
    public void adicionarAluno(Aluno aluno){
        alunosDaDiciplina.add(0, aluno);
    }
    public String imprimirDiciplina() {
        return "Diciplina [nomeDiciplina=" + nomeDiciplina + ", horarioDiciplina=" + horarioDiciplina + ", sala=" + sala
                + "]";
    }
}
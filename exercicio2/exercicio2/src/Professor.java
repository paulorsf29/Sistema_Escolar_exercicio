import java.util.ArrayList;
public class Professor {
    private String nome;
    private String departamento;
    private String email;

    public static ArrayList<Diciplina> diciplinaDoProfesssor = new ArrayList<>();

    public Professor(String nome, String departamento, String email, ArrayList<Diciplina> diciplinaDoProfesssor) {
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
        Professor.diciplinaDoProfesssor = diciplinaDoProfesssor;

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Diciplina> getDiciplinaDoProfesssor() {
        return diciplinaDoProfesssor;
    }
    public void setDiciplinaDoProfesssor(ArrayList<Diciplina> diciplinaDoProfesssor) {
        Professor.diciplinaDoProfesssor = diciplinaDoProfesssor;
    }
    
    public void adicionarDiciplina(Diciplina diciplina){
        diciplinaDoProfesssor.add(diciplina);
    }
    public String imprimirProfessores() {
        return "Professor [nome=" + nome + ", departamento=" + departamento + ", email=" + email + "]";
    }
    
    
}
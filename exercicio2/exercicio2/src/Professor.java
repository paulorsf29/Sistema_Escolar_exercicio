import java.util.ArrayList;
public class Professor {
    private String nome;
    private String departamento;
    private String email;

    private ArrayList<Diciplina> diciplinaDoProfesssor = new ArrayList<>();

    public Professor(String nome, String departamento, String email) {
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
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
    
    public void adicionarDiciplina(Diciplina diciplina){
        diciplinaDoProfesssor.add(diciplina);
    }

    public String imprimirProfessor() {
        return "Professor [nome=" + nome + ", departamento=" + departamento + ", email=" + email + "]";
    }
    
    
}
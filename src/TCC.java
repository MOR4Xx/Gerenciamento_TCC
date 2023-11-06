import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TCC {
    private String nomeArquivo;
    private int id;
    private String titulo;
    private String aluno;
    private String orientador;
    private String status;

    public TCC(String titulo, String aluno, String orientador, String status) {

        this.id = Armazenar_id.ID(id);
        this.titulo = setTitulo(titulo);
        this.aluno = setAluno(aluno);
        this.orientador = setOrientador(orientador);
        this.status = setStatus(status);
    }

    // public String setId(String id) {
    // return
    // }
    public String setTitulo(String titulo) {
        return this.titulo = titulo;
    }

    public String setAluno(String aluno) {
        return this.aluno = aluno;
    }

    public String setOrientador(String orientador) {
        return this.orientador = orientador;
    }

    public String setStatus(String status) {
        return this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAluno() {
        return aluno;
    }

    public String getOrientador() {
        return orientador;
    }

    public String getStatus() {
        return status;
    }
    public String setnomeArquivo(String nomeAraquivo){
        return this.nomeArquivo= nomeAraquivo;
    }
    public String getnomeArquivo(String nomeArquivo){
        return nomeArquivo;
    }

    public String salvar() {
        try {
            FileWriter fw = new FileWriter("tccs.txt", true); // true para acrescentar informações no final do arquivo
            PrintWriter pw = new PrintWriter(fw);
            pw.println("ID: " + this.getId());
            pw.println("Nome do Arquivo: "+this.getnomeArquivo(nomeArquivo));
            pw.println("Titulo: " + this.getTitulo());
            pw.println("Aluno: " + this.getAluno());
            pw.println("Orientador: " + this.getOrientador());
            pw.println("Status: " + this.getStatus());
            pw.println(); // Adiciona uma linha em branco para separar os TCCs
            pw.close();
            return "TCC salvo com sucesso!";
        } catch (IOException e) {
            return "Erro ao salvar TCC: " + e.getMessage();
        }
    }
    public String salvararquivo() {
        try {
            FileWriter fw = new FileWriter(nomeArquivo, true); // true para acrescentar informações no final do arquivo
            PrintWriter pw = new PrintWriter(fw);
            pw.println("ID: " + this.getId());
            pw.println("Titulo: " + this.getTitulo());
            pw.println("Aluno: " + this.getAluno());
            pw.println("Orientador: " + this.getOrientador());
            pw.println("Status: " + this.getStatus());
            pw.println(); // Adiciona uma linha em branco para separar os TCCs
            pw.close();
            return " ";
        } catch (IOException e) {
            return "Erro ao salvar TCC: " + e.getMessage();
        }
    }

}

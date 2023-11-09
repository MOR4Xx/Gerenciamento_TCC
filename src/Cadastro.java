import java.io.FileWriter;
import java.io.IOException;

public class Cadastro {
    public static void Cadastrar() {
        String titulo = Input.entradaString("Digite o Titulo do TCC: ");
        String aluno = Input.entradaString("Digite o nome do aluno: ");
        String orientador = Input.entradaString("Digite o nome do Orientador: ");
        String status = Input.entradaString("Digite o status da avaliação: ");
        TCC cadastro = new TCC(titulo, aluno, orientador, status);// titulo, aluno, orientador, status);

        cadastro.setTitulo(titulo);
        cadastro.setAluno(aluno);
        cadastro.setOrientador(orientador);
        cadastro.setStatus(status);

        try {
            FileWriter file = new FileWriter(cadastro.getId()+".txt");
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block]
            System.out.println("Erro ao criar o arquivo.");
            e.printStackTrace();
        }
        String name = (Integer.toString(cadastro.getId()))+".txt";
        cadastro.setnomeArquivo(name);
        cadastro.getnomeArquivo(name);
        System.out.println(cadastro.salvar());
        System.out.println(cadastro.salvararquivo());
        System.out.println();

    }
}

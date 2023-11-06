import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Lista {
    public static void main(String[] args) {
        String arquivo = lerArquivo("tccs.txt");

        if (arquivo != null) {
            System.out.println("Lista de TCCs cadastrados:");
            System.out.println(arquivo);
        } else{
            System.out.println("Nenhum TCC cadastrado");
        }
    }
    public static String lerArquivo(String arquivo) {
        StringBuilder conteudo = new StringBuilder();
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fr);
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return conteudo.toString();
    }
}

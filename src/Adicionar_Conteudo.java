import java.io.FileWriter;
import java.io.PrintWriter;
public class Adicionar_Conteudo {
    public static void AddCont(){
        String arq = Input.entradaString("Digite o id do Arquivo que deseja modificar: ");
        arq+= ".txt";
        try {
            FileWriter fw = new FileWriter(arq); // true para acrescentar informações no final do arquivo
            PrintWriter pw = new PrintWriter(fw);
            pw.println(Input.entradaString("Digite o conteudo do TCC: "));
            pw.println();
            pw.close();
            System.out.println();
            System.out.println("Arquivo alterado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar conteudo" + e.getMessage());
        }
    }
}

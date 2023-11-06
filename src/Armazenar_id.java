import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Armazenar_id {
    public static int ID(int id) {
        aumentarID();
        try (BufferedReader leitor = new BufferedReader(new FileReader("id.txt"))) {
            String line = leitor.readLine();
            id = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id;
    }
    public static String aumentarID() {
        try (BufferedReader leitor = new BufferedReader(new FileReader("id.txt"))) {
            String line = leitor.readLine();
            int num_id = Integer.parseInt(line);
            num_id++;
            FileWriter fw = new FileWriter("id.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(num_id);
            pw.close();
            return "";
        } catch (IOException e) {
            return "Erro ao salvar ID " + e.getMessage();
        }
    }
}

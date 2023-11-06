import java.util.Scanner;

public class Input {
    public static double entradaDouble(String mensagem) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print(mensagem);
        double input = 0;
        try {
            input = entrada.nextDouble();

        } catch (java.util.InputMismatchException e1) {
            System.out.println("Digite valor valido!!");
            input = 0;
            Menu.menu();
        } catch (NullPointerException e2) {
            System.out.println("Digite algo no terminal");
        } catch (Exception e3) {
            System.out.println("Algo deu errado");
            e3.printStackTrace();
        }
        return input;
    }

    public static int entradaInt(String mensagem) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print(mensagem);
        int input = 0;
        try {
            input = entrada.nextInt();

        } catch (java.util.InputMismatchException e1) {
            System.out.println("Digite valor valido!!");
            input = 0;
            Menu.menu();
        } catch (NullPointerException e2) {
            System.out.println("Digite algo no terminal");
        } catch (Exception e3) {
            System.out.println("Algo deu errado");
            e3.printStackTrace();
        }
        return input;
    }

    public static String entradaString(String mensagem) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.print(mensagem);
        // return entrada.nextLine();
        String input = "";
        try {
            input = entrada.nextLine();
        } catch (NullPointerException e1) {
            System.out.print("Error!! ");
            e1.printStackTrace();
        } catch (Exception e2) {
            System.out.println("Algo deu errado");
            e2.printStackTrace();
            Menu.menu();
        }
        return input;
    }
}

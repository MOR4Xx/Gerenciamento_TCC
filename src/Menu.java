public class Menu {

    public static void menu() {
        int menu = 0;
        do {
            System.out.println();
            System.out.println("==================================");
            System.out.println("MENU");
            System.out.println("1- Cadastrar TCC");
            System.out.println("2- Lista de TCCs");
            System.out.println("3- Adicionar Conteúdo");
            //System.out.println("4- Lista de TCCs em execução");
            //System.out.println("5- Lista de TCCs Aprovados e Reprovaodos");
            System.out.println("6- Sair");
            System.out.println();

            menu = Input.entradaInt("Digite a entrada de execução: ");
            System.out.println();
            switch (menu) {
                case 1:
                    Cadastro.Cadastrar();
                    break;
                case 2:
                    Lista.main(null);
                    break;
                case 3:
                    Adicionar_Conteudo.AddCont();
                    break;
                // case 4:
                // listaExecução();
                // break;
                // case 5:
                // AdicionarCont();
                // break;
                case 6:
                System.out.println("Programa Finalizando...");
                return;
                default:
                System.out.println("Digite um valor valido do menu!!");
                break;
            }

        } while (menu != 6);
    }
}
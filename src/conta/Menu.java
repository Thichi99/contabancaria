package conta;

import java.util.Scanner;
import conta.util.Cores;

public class Menu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND);

            System.out.println("****************************************************************");
            System.out.println("                                                                ");
            System.out.println("\n\t\t\t\tBANCO DO BRAZIL COM Z                                 ");
            System.out.println("                                                                ");
            System.out.println("****************************************************************");
            System.out.println("                                                                ");
            System.out.println("\n\t\t\t1 - Criar Conta                                         ");
            System.out.println("\n\t\t\t2 - Listar todas as Contas                              ");
            System.out.println("\n\t\t\t3 - Buscar Conta por Número                             ");
            System.out.println("\n\t\t\t4 - Atualizar Dados da Conta                            ");
            System.out.println("\n\t\t\t5 - Apagar Conta                                        ");
            System.out.println("\n\t\t\t6 - Sacar                                               ");
            System.out.println("\n\t\t\t7 - Depositar                                           ");
            System.out.println("\n\t\t\t8 - Tranferir valores entre Contas                      ");
            System.out.println("\n\t\t\t9 - Sair                                                ");
            System.out.println("                                                                ");
            System.out.println("****************************************************************");
            System.out.println("Entre com a opção desejada:                                     ");
            System.out.println("                                                                " + Cores.TEXT_RESET);

            opcao = leia.nextInt();

            if (opcao == 9) {
                System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");

                    break;
                case 2:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas \n\n");

                    break;
                case 3:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

                    break;
                case 7:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

                    break;
                case 8:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

                    break;
                default:
                    System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida!\n");
                    break;
            }


        }
    }

    public static void sobre() {
        System.out.println("\n****************************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Thiago dos Passos Lima - thiago.plima99@gmail.com");
        System.out.println("https://github.com/Thichi99");
        System.out.println("****************************************************************");
    }
}

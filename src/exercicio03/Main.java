package exercicio03;

import java.util.Scanner;

public class Main {

    //local de declarar variaáveis
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.println("Nome do usuário: ");
        String usuario = sc.nextLine();
        System.out.println("Tipo de tarifa: ");
        String tipoTarifa = sc.next();
        bilhete = new BilheteUnico(usuario, tipoTarifa);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("________________________________________");
            System.out.println("1. Carregar Bilhete");
            System.out.println("2. Consultar Saldo");
            System.out.println("3. Passar na catraca");
            System.out.println("4. Sair");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1 -> carregar();
                case 2 -> consultar();
                case 3 -> catraca();
                case 4 -> System.out.println("Sessão Finalizada!");
                default -> System.out.println("Opção inválida!");

            }

        } while(opcao != 4);

    }

    private static void catraca() {
        if(bilhete.passarNaCatraca() == false) {
            System.out.println("Saldo insuficiente");
        }
        consultar();
    }

    private static void consultar() {
        System.out.println("Saldo atual: " + bilhete.saldo);
    }

    private static void carregar() {
        double valor;
        System.out.println("Valor da recarga: ");
        valor = sc.nextDouble();
        bilhete.passarNaCatraca(valor);

    }
}

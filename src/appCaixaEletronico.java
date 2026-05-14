import java.util.Scanner;

public class appCaixaEletronico {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double saldo = 500;

        while (true) {

            System.out.println("""
                    \n------------------------
                    --- CAIXA ELETRÔNICO ---
                    1 - Saque
                    2 - Depósito
                    3 - Saldo
                    0 - Sair
                    Escolha uma opção:""");

            String opcao = sc.next();

            switch (opcao) {
                case "1":

                    System.out.println("Valor do saque: R$");
                    double valorSaque = sc.nextDouble();

                    if (valorSaque <=0 ){
                        System.out.println("Erro: O valor deve ser positivo. ");
                    } else if (valorSaque > saldo) {
                        System.out.println("Erro: Saldo insuficiente. ");

                    }else {
                        saldo -= valorSaque;
                        System.out.println("Novo saldo: R$ " + saldo);
                    }
                    break;

                case "2":

                        System.out.println("Valor do depósito: R$ ");
                        double valorDeposito = sc.nextDouble();

                        if (valorDeposito <0 ){
                            System.out.println("Erro: O valor deve ser positivo.");
                        }else {
                            saldo += valorDeposito;
                            System.out.println("Depósito realizado! Novo saldo: R$ " + saldo);
                        }
                        break;

                case "3":

                            System.out.println("Seu saldo atual é: R$ "+ saldo);
                            break;

                case "0":

                                System.out.println("Encerrando ");

                                return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");


            }
        }
    }
}
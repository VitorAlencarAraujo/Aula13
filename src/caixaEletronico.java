import java.util.Scanner;

public class caixaEletronico {
    static void main() {

        /*3. O sistema de um caixa eletrônico de uma loja recebe produtos até digitar 0 para finalizar a compra.
Durante a compra: somar os valores do produtos
Após ser finalizada: Exibir na tela o valor total da compra.*/

        Scanner sc = new Scanner(System.in);


        double total = 0;

        while (true) {
            System.out.println("\nQual o produto? (digite 0 para parar)");
            String nomeProduto = sc.next();

            if (nomeProduto.equals("0")) {
                break;
            }

            System.out.println("Informe o preço do produto:");
            double valor = sc.nextDouble();

            total += valor;
            }
        System.out.println("Esse é o valor total da compra: "+ total);
        }
    }


 
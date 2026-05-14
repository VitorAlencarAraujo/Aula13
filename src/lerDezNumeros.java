import java.util.Scanner;

public class lerDezNumeros {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int numero;
        int soma = 0;
        double media;

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int somaPares = 0;
        int somaImpares = 0;

        int qtdPares = 0;
        int qtdImpares = 0;

        // Ler 10 números
        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();

            // Soma total
            soma += numero;

            // Maior número
            if (numero > maior) {
                maior = numero;
            }

            // Menor número
            if (numero < menor) {
                menor = numero;
            }

            // Verificar se é par ou ímpar
            if (numero % 2 == 0) {
                somaPares += numero;
                qtdPares++;
            } else {
                somaImpares += numero;
                qtdImpares++;
            }
        }

        // Média
        media = (double) soma / 10;

        // Exibição dos resultados
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);
        System.out.println("Maior número lido: " + maior);
        System.out.println("Menor número lido: " + menor);
        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Quantidade de pares: " + qtdPares);
        System.out.println("Quantidade de ímpares: " + qtdImpares);
    }
}

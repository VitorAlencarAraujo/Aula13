
import java.util.Arrays;
import java.util.Scanner;

public class mediaAlunos {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos = 4;
        int quantidadeNotas = 4;

        for (int aluno = 1; aluno <= quantidadeAlunos; aluno++) {

            System.out.println("\nAluno " + aluno);
            double[] notas = new double[quantidadeNotas];

            for (int i = 0; i < quantidadeNotas; i++) {
                System.out.print("Informe a nota " + (i + 1) + ": ");
                notas[i] = sc.nextDouble();
            }

            double media = Arrays.stream(notas).average().orElse(0); // Cria a media entre os valores do Array

            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

        sc.close();

    }
}

import java.util.Scanner;

public class lerVotos {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int joao = 0;
        int maria = 0;
        int nulo = 0;

        System.out.println("""
                1 = João
                2 = Maria
                outro = nulo
                """);

        for (int i = 1; i <= 10; i++){
            System.out.print("Voto "+ i + ":");
            int voto = sc.nextInt();

            if (voto == 1){
                joao += 1;
            } else if (voto == 2) {
                maria += 1;
            }
            else {
                nulo += 1;
            }
        }

        System.out.println("\nJoão teve " + joao + " votos");
        System.out.println("Maria teve " + maria + " votos");
        System.out.println("Votos Nulos: " + nulo);

        if (joao > maria){
            System.out.println("\nJoão Venceu!!!");
        } else if (maria > joao) {
            System.out.println("\nMaria Venceu!!!");
        }
        else {
            System.out.println("\nEmpate!!!");
        }
    }
}

import java.util.Scanner;

public class tentativasSenhas {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int senha = 4321;
        int i = 1;

        while (i <= 3){

            System.out.println("Senha: ");
            int tentativaSenha = sc.nextInt();
            i++;

            if (senha == tentativaSenha){
                System.out.println("acesso liberado");
                break;
            }
        }

    }
}

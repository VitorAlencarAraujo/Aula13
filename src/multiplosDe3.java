public class multiplosDe3 {
    static void main() {

        int soma = 0;

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                soma += i;
            }
        }
        System.out.println("A soma entre todos os multiplos de 3 entre 1 a 100 é: "+ soma);
    }
}

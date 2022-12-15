import java.util.Scanner;

public class 9Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int soma = 0 ;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um número: ");
            int numero = in.nextInt();

            soma += numero;
        }

        System.out.println("A soma dos números informados é " + soma / 10);

        in.close();

    }
}
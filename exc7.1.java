import java.util.Scanner;

public class 7.1Exercicio {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int maior1 = 0;
        int maior2 = 0;



        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();

            if(numero > 0){
                if(numero > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = numero;
                }else if(numero > maior2){
                    maior2 = numero;
                }
            }

        }
        int resultado = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + resultado);

    }
}
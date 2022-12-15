import java.util.Scanner;

public class 13Exercicio{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);


    System.out.println("Digite o primeiro numero: ");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo numero ");
        int n2 = in.nextInt();

        int contagem= n2 - n1;

        while(n1 <= n2){
            int num = contagem + n1;
            System.out.println(num);
            n1++;
        }

        int media = num/contagem;
        System.out.println("A media aritmetica é: " + media);


    }
}



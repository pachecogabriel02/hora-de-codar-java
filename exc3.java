import java.util.Scanner;
public class 3Exercicio {
    public static void main(String[]args)
    {
        System.out.println("Qual é o seu nome ?");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        System.out.println("Qual a sua idade?");
        Int idade = in.nextInt();
        
        System.out.println("Olá, " + nome + ", sua idade é " + idade);

        in.close();
    }
}
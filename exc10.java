import java.util.Scanner;

public class 10Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int soma = 0;

        for(int i = 0; i < 4; i++ ){
            System.out.print("Digite a nota do aluno: ");
            int nota = in.nextInt();

            soma += nota;
        }

        double media = soma/4;

        System.out.println("Sua média foi " + media);

        if( media >= 6 ){
            System.out.println("PARABÉNS! Você foi aprovado !!");
        } else {
             System.out.println("Que pena :( Você foi reprovado !!");
        }

        in.close();


    }
}
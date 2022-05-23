import java.util.Scanner;
public class MediaFundamental {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int RA;
        double nota1, nota2, nota3, media;

        while (true) {
            System.out.print("\nDigite seu RA: ");
            RA = scan.nextInt();
            if (RA == 0)
            break;
            System.out.printf("\nAluno " + RA + ", digite a primeira nota: ");
            nota1 = scan.nextDouble();
            System.out.printf("Aluno " + RA + ", digite a segunda nota: ");
            nota2 = scan.nextDouble();
            System.out.printf("Aluno " + RA + ", digite a terceira nota: ");
            nota3 = scan.nextDouble();

            media = ((nota1 + nota2 + nota3) / 3);
            
            if (media >= 8)
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce foi aprovado!\n"); }
           else if (media < 8 && media > 6)
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce tera que fazer recuperacao!\n"); }
           else
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e foi reprovado!\n"); }
        }
        System.out.print("RA invalido!");
    }
}
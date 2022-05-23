import java.util.Scanner;
public class MediaFundamental {
    public static void main(String[] args){
        //Uso do Scanner para entrada de dados
        Scanner scan = new Scanner(System.in);
        //Declaração das variáveis
        int RA;
        double nota1, nota2, nota3, media;

        //Uso do while para repetição do programa
        while (true) {
            //Entrada de dados da variável RA
            System.out.print("\nDigite seu RA: ");
            //Leitura do valor digitado
            RA = scan.nextInt();
            //Condicional para identificar se o programa deve parar
            if (RA == 0)
            break;
            //Entrada de dados da variável nota1
            System.out.printf("\nAluno " + RA + ", digite a primeira nota: ");
            //Leitura do valor digitado
            nota1 = scan.nextDouble();
            //Entrada de dados da variável nota2
            System.out.printf("Aluno " + RA + ", digite a segunda nota: ");
            //Leitura do valor digitado
            nota2 = scan.nextDouble();
            //Entrada de dados da variável nota3
            System.out.printf("Aluno " + RA + ", digite a terceira nota: ");
            //Leitura do valor digitado
            nota3 = scan.nextDouble();

            //Cálculo da média
            media = ((nota1 + nota2 + nota3) / 3);
            
            //Condicional para determinar e apresentar se o aluno foi Aprovado, se terá que fazer Recuperação ou se foi Reprovado
            if (media >= 8)
            { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce foi aprovado!\n"); }
           else if (media < 8 && media > 6)
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e voce tera que fazer recuperacao!\n"); }
           else
           { System.out.printf("Aluno " + RA + ", sua media e igual a " + media + " e foi reprovado!\n"); }
        }
        //Apresentação para o usuário de que o RA é inválido e que a programação irá finalizar
        System.out.print("RA invalido!");
    }
}

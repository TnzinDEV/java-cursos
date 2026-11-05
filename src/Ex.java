import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sue salario?");

        double salario = leitor.nextDouble();
        double taxa;

        if (salario >= 2000) {
            taxa = salario * 0.11;
        } else if (salario >= 1500) {   // já sabemos que é < 2000
            taxa = salario * 0.09;
        } else {
            taxa = salario * 0.08;
        }

        System.out.printf("Salario Com Taxa: R$ %.2f%n", taxa);
        leitor.close();


    }
}
//se for maior ou igual a 2000 11% de taxa
//entre 1500 e 2000 9% de taxa
//menor que 8% de taxa
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano qualquer e o nosso sistema ira dizer se e bissesto ou nao😎.");
        int ano= input.nextInt();

        if (ano%400==0){
        System.out.println("Bissexto");
        }
        else if (ano%100==0) {
            System.out.print("Nao e Bissexto");
        }
        else {
            System.out.println("Nao e Bissexto");
        }
    }
}

   // Leia um ano e informe se ele é bissexto. A regra:
       // Divisível por 400 → bissexto
       // Senão, divisível por 100 → não é bissexto
      ////  Senão, divisível por 4 → bissexto
      //  Nos demais casos → não é bissexto
      //  Reflita: por que a ordem dos testes importa aqui? O que acontece com 1900 se você testar
      //  o % 4 primeiro?
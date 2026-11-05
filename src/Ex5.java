import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de entrada: ");
        int entrada = input.nextInt();
        int cem = entrada / 100;
         int cinquenta = entrada / 50;
         int vinte = entrada / 20;
         int dez = entrada / 10;
         int cinco = entrada / 5;
         int dois = entrada / 2;
         int  um = entrada / 1;

        System.out.printf("Notas de 100: %d%n", cem);
        System.out.printf("Notas de 50 : %d%n", cinquenta);
        System.out.printf("Notas de 20 : %d%n", vinte);
        System.out.printf("Notas de 10 : %d%n", dez);
        System.out.printf("Notas de 5  : %d%n", cinco);
        System.out.printf("Notas de 2  : %d%n", dois);
        System.out.printf("Notas de 1  : %d%n", um);
    }
    }



//Exercício 3 – Caixa eletrônico
        //Leia um valor inteiro de saque. Mostre a menor quantidade de cédulas de R$ 100, 50, 20,
        //10, 5 e 2 e de moedas de R$ 1 para pagar esse valor.
       // Entrada: 388
       // Saída: 100: 3 | 50: 1 | 20: 1 | 10: 1 | 5: 1 | 2: 1 | 1: 1
      //  Dica: use uma variável restante que é atualizada com % depois de cada tipo de cédula.
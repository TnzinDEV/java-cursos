import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Digite um numero de ate 3 Digitos: ");
        int number = input.nextInt();
        int centena = number / 100;
        int dezena = (number / 10) % 10;
        int unidade = number % 10;
        System.out.println("Centena " + centena + "| Dezena " + dezena + "| Unidade " + unidade );
        int soma = centena + dezena + unidade;
        System.out.println("Soma dos digitos: " + soma);
        int inverter = (unidade & dezena &  centena);
        System.out.println("Inversao dos digitos: "+ inverter);
    }
}

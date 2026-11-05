import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome = "Tony";
        System.out.println(nome + " ingress in Game!");
        System.out.println("Ola " + nome + "!!!");
        int numero = 16;
        System.out.println(nome + " tem " + numero + " anos!");
        double preco = 136.50;
        double desconto = 80.00;
        System.out.println(nome + " tem que pagar: " + preco + ". (Por Ingressar no jogo)!");
        System.out.println("Valor Descontado: " + desconto + "(Por Ser gostoso demaiskkkj)");
        System.out.println("Valor a pagar: " + (preco - desconto) + "paga logo Vacilao!");
        boolean classeplayer = true;

        //input
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sua Patente?");
        String rank = leitor.nextLine();
        System.out.println("Seu Ranking atual "+ rank + ". GG!");

        //operador = ao python kkkk
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        String idade = ler.nextLine();

        if (Integer.parseInt(idade) > 65) {
            System.out.println("Idade feliz");
        }
        //elif = else if
        else if (Integer.parseInt(idade)>= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
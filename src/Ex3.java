import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Informe os segundos ao sistema.");
        int tempo = input.nextInt();

        int dias = tempo / 86400;

        int horas = (tempo % 86400) / 3600;

        int minutos = (tempo % 3600) / 60;

        int segundos = tempo % 60;

        System.out.println("dias= " + dias + " /horas= " + horas
                + " /minutos= " + minutos + " /segundos= " + segundos);

    }
}
//Exercício 1 – Conversor de tempo
//Leia uma quantidade de segundos ( int ) e mostre quantos dias, horas, minutos e
//segundos ela representa.
//Entrada: 100000
//Saída: 1 dia(s), 3 hora(s), 46 minuto(s) e 40 segundo(s)
//Dica: !!!um dia tem 86400 segundos.!!! Depois de calcular os dias, use % para descobrir
//quanto sobrou.





//Siga este caminho:
//
//Leia a quantidade total de segundos.
//
//Descubra quantos dias completos cabem nesse valor usando a divisão inteira.
//
//Calcule o resto dos segundos usando %.
//
//Com o restante, descubra as horas completas.
//
//Calcule novamente o resto.
//
//Use o mesmo raciocínio para descobrir os minutos.
//
//O que sobrar serão os segundos finais.
//
//Mostre os quatro valores na ordem: dias, horas, minutos e segundos.
//
//Ideia principal: use a divisão inteira (/) para descobrir cada unidade e o resto (%) para continuar os cálculos com o que sobrou.
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dgie os tres lados");
        double l1 = input.nextDouble();
        double l2 = input.nextDouble();
        double l3 = input.nextDouble();
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("Equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.print("Isósceles");
            } else {
                System.out.print("Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
    }
}

//Leia três lados ( double ). Primeiro verifique se eles formam um triângulo: cada lado
//precisa ser menor que a soma dos outros dois. Se formarem, classifique:
//Equilátero: três lados iguais
//Isósceles: exatamente dois lados iguais
//Escaleno: três lados diferentes
//Dica: é mais fácil testar equilátero e escaleno com && e deixar isósceles para o else .
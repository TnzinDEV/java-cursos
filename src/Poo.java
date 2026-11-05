import java.util.Scanner;


class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;


    // Construtor "Nascimento do objeto"
    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;

    }

    //Segundo Constructor
    public ContaBancaria(String titular, int numero, double depositoinicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = depositoinicial;


    }
    //Getters "Imprimir algo Privado"
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }



    //Setters "Alterar algo privado"

    //adiciona argumento valor e "subistitui por saldo"
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }else {
            System.out.print("Valor indefinido!");
        }
    }

    boolean sacar (double valor) {
        if (valor<= this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    //
    void exibirextrato(){
        System.out.println("\n--- Extrato ---");
        System.out.println("Titular: "+ titular);
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: "+ saldo);
    }
}
 public class Poo {
        public static void main(String[] args) {


        }


}

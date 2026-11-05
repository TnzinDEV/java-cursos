import java.util.Scanner;

public class Ex2Home {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Teste!");
        String User = "admin";
        String senha = "java123";
        String NewSenha = "java456";
        String NewUser = "admin";
        if (User == NewUser & senha == NewSenha) {
        System.out.println("Novo Usuario Cadastrado Com Sucesso!");}
        else{
            System.out.println("Error! os dados nao coicidem!");
        }
    }
}


//O usuário correto é admin.
//
//
//
//A senha correta é java123.
//
//
//
//Se ambos estiverem corretos, mostre Login realizado com sucesso!.
//
//
//
//Caso contrário, mostre Usuário ou senha incorretos.
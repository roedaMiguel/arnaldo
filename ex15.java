// Defina um usuário e senha fixos no código. leia o usuário e a
//  senha digitados e exiba "Acesso permitido" ou "Acesso negado".
//   Obrigatório: use o operador ternário para exibir a mensagem.

import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int usuarioFixo = 1;
        int senhaFixa = 1234;

        System.out.println("Informe o usuário (1): ");
        int usuario = scanner.nextInt();

        System.out.println("Informe a senha: ");
        int senha = scanner.nextInt();

        if (usuario == usuarioFixo) {
            if (senha == senhaFixa) {
                System.out.println("Acesso permitido");
            } 
            else {
                System.out.println("Acesso negado");
            }
        } 
        else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}
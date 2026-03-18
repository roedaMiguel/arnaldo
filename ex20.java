// Leia a escolha de dois jogadores ("pedra", "papel" ou "tesoura") e determine quem venceu ou
//  se houve empate usando if/else encadeado. Desafio: use o operador ternário para exibir o resultado
//   final ("Jogador 1 venceu", "Jogador 2 venceu" ou "Empate").

import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogador 1 - 1=Pedra  2=Papel  3=Tesoura: ");
        int jogador1 = scanner.nextInt();

        System.out.println("Jogador 2 - 1=Pedra  2=Papel  3=Tesoura: ");
        int jogador2 = scanner.nextInt();

        String resultado;

        if (jogador1 == jogador2) {
            resultado = "Empate";
        } else if (jogador1 == 1) {
            if (jogador2 == 3) {
                resultado = "Jogador 1 venceu";
            } else {
                resultado = "Jogador 2 venceu";
            }
        } else if (jogador1 == 2) {
            if (jogador2 == 1) {
                resultado = "Jogador 1 venceu";
            } else {
                resultado = "Jogador 2 venceu";
            }
        } else {
            if (jogador2 == 2) {
                resultado = "Jogador 1 venceu";
            } else {
                resultado = "Jogador 2 venceu";
            }
        }

        System.out.println(resultado);

        scanner.close();
    }
}

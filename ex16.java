// Se é múltiplo de 3 e de 5 simultaneamente
// Se é múltiplo apenas de 3
// Se é múltiplo apenas de 5
// Se não é múltiplo de nenhum
// Desafio: use o ternário onde for possível.


import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0) {
            if (numero % 5 == 0) {
                System.out.println("É múltiplo de 3 e de 5.");
            }
             else {
                System.out.println("É múltiplo apenas de 3.");
            }
        }
         else if (numero % 5 == 0) {
            System.out.println("É múltiplo apenas de 5.");
        } 
        else {
            System.out.println("Não é múltiplo de 3 nem de 5.");
        }

        scanner.close();
    }
}
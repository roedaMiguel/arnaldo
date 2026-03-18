// Leia três números inteiros e exiba qual é
//  o maior entre os três. Trate o caso de empate.

import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Informe o terceiro número: ");
        int n3 = scanner.nextInt();

        if (n1 == n2) {
            if (n2 == n3) {
                System.out.println("Os três números são iguais.");
            } 
            else if (n1 >= n3) {
                System.out.println("O maior número é: " + n1);
            } 
            else {
                System.out.println("O maior número é: " + n3);
            }
        } 
        else if (n1 >= n2) {
            if (n1 >= n3) {
                System.out.println("O maior número é: " + n1);
            } 
            else {
                System.out.println("O maior número é: " + n3);
            }
        } 
        else if (n2 >= n3) {
            System.out.println("O maior número é: " + n2);
        }
         else {
            System.out.println("O maior número é: " + n3);
        }

        scanner.close();
    }
}

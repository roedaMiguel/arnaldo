// Leia um número e informe se é positivo, negativo
//  ou zero. Obrigatório: use o operador ternário aninhado.

import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        String resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
        System.out.println("O número é: " + resultado);

        scanner.close();
    }
}

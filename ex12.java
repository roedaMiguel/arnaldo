// Leia uma nota (0-10) e exiba o conceito:
// 9 a 10 → "A"
// 7 a 8 → "B"
// 5 a 6 → "C"
// 0 a 4 → "D"

import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Conceito: A");
        } 
        else if (nota >= 7) {
            System.out.println("Conceito: B");
        }
         else if (nota >= 5) {
            System.out.println("Conceito: C");
        }
         else {
            System.out.println("Conceito: D");
        }



        scanner.close();
    }
}

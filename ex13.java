// scanner o número do mês (1-12) e exiba a estação
//  do ano correspondente (considere o hemisfério sul)

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do mês (1-12): ");
        int mes = scanner.nextInt();

        if (mes == 12) {
            System.out.println("Verão");
        } 
        else if (mes == 1) {
            System.out.println("Verão");
        }
         else if (mes == 2) {
            System.out.println("Verão");
        } 
        else if (mes == 3) {
            System.out.println("Outono");
        }
         else if (mes == 4) {
            System.out.println("Outono");
        } 
        else if (mes == 5) {
            System.out.println("Outono");
        }
         else if (mes == 6) {
            System.out.println("Inverno");
        }
         else if (mes == 7) {
            System.out.println("Inverno");
        }
         else if (mes == 8) {
            System.out.println("Inverno");
        
        } else if (mes == 9) {
            System.out.println("Primavera");
        }
         else if (mes == 10) {
            System.out.println("Primavera");
        }
         else if (mes == 11) {
            System.out.println("Primavera");
        }
         else {
            System.out.println("Mês inválido");
        }

        scanner.close();
    }
}

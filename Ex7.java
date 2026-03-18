// Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, 
// isósceles ou escaleno

import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o lado A: ");
        double a = scanner.nextDouble();

        System.out.println("Informe o lado B: ");
        double b = scanner.nextDouble();

        System.out.println("Informe o lado C: ");
        double c = scanner.nextDouble();

        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    if (a == b) {

                        if (b == c) {
                            System.out.println("Triângulo Equilátero");
                        } else {
                            System.out.println("Triângulo Isósceles");
                        }
                    } 
                    else if (a == c) {
                        System.out.println("Triângulo Isósceles");
                    } 
                    else if (b == c) {
                        System.out.println("Triângulo Isósceles");
                    } 
                    else {
                        System.out.println("Triângulo Escaleno");
                    }
                } 
                else {
                    System.out.println("Os lados não formam um triângulo válido.");
                }
            } 
            else {
                System.out.println("Os lados não formam um triângulo válido.");
            }
        }
         else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

        scanner.close();
    }
}
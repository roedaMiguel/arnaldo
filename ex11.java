// Uma sala de cinema cobra:
// Menores de 12 anos: R$ 10,00
// Entre 12 e 60 anos: R$ 20,00
// Acima de 60 anos: R$ 10,00 (meia)
// leia a idade e exiba o valor do ingresso.

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Valor do ingresso: R$ 10,00");
        } 
        else if (idade <= 60) {
            System.out.println("Valor do ingresso: R$ 20,00");
        } 
        else {
            System.out.println("Valor do ingresso: R$ 10,00 (meia)");
        }

        scanner.close();
    }
}
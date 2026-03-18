// Leia dois números e um operador (+, -, *, /)
//  e realize a operação correspondente usando switch.
//  Trate a divisão por zero.
import java.util.Scanner;



public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Informe a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '-':
                resultado = n1 - n2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '*':
                resultado = n1 * n2;
                System.out.println("O resultado é: " + resultado);
                break;

            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println("O resultado é: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operação inválida!");
        }

        sc.close();
    }
}
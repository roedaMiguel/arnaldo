import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = scanner.nextInt();

        int maior = (n1 > n2) ? n1 : n2;
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}

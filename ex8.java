// leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique:
// IMC < 18.5 → "Abaixo do peso"
// 18.5 ≤ IMC < 25 → "Peso normal"
// 25 ≤ IMC < 30 → "Sobrepeso"
// IMC ≥ 30 → "Obesidade"
// Desafio: use o ternário para exibir se o IMC está "dentro" ou "fora" da faixa saudável.


import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Informe a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);


        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");

        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");

        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");

        } else {
            System.out.println("Classificação: Obesidade");

        }

        String faixa = (imc >= 18.5) ? "dentro" : "fora";
        if (imc >= 25) {
            faixa = "fora";
        }

        System.out.println("Você está " + faixa + " da faixa saudável.");

        scanner.close();
    }
}

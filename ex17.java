// Uma loja dá desconto conforme o valor da compra:
// Acima de R$ 500 → 20% de desconto
// Entre R$ 200 e R$ 500 → 10% de desconto
// Abaixo de R$ 200 → sem desconto
// Leia o valor e exiba o valor final após o desconto.

import java.util.Scanner;
public class ex17 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o valor do produto");
         if (scanner.hasNextInt()) {
         int valor = scanner.nextInt();

         if (valor >= 500 ){
            double promo = valor * 0.20;
            double fpreco = valor - promo;
            
            System.out.println("como o produto custa mais de 500 reais, voce tem 20% de desconto");
            System.out.println("o valor final com o desconto é " +fpreco+ " reais");
         }
         else if(valor>=200){
            double promo = valor * 0.10;
            double fpreco = valor - promo;

            System.out.println("como o produto que voce comprou custa mais de 200 reais, voce tem 10% de desconto");
            System.out.println("o valor final com o desconto é " +fpreco+ " reais");
         }
         else{
            System.out.println("Voce nao tem desconto");
         }




        scanner.close();
    }
    
}}

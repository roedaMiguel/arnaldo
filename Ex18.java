// Leia um número de 1 a 10 e exiba seu equivalente
//  em algarismo romano usando switch

import java.util.Scanner;

public class Ex18 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um numero de 1 a 10");
         if (scanner.hasNextInt()) { // verifica se digitou número
            int n = scanner.nextInt();
            System.out.println("isso nao é um numero");

        


        if (n <= 0 && n >10){
            System.out.println("Numero invalido");
        }
        switch (n) {
             case 1:
                System.out.println("o numero" +n+ " em algarismos romanos é  I");
                break;
             case 2:
                System.out.println("o numero" +n+ " em algarismos romanos é  II");
                break;
             case 3:
                System.out.println("o numero" +n+ " em algarismos romanos é  III");
                break;
             case 4:
                System.out.println("o numero" +n+ " em algarismos romanos é  IV");
                break;
             case 5:
                System.out.println("o numero" +n+ " em algarismos romanos é  V");
                break;
             case 6:
                System.out.println("o numero" +n+ " em algarismos romanos é  VI");
                break;
             case 7:
                System.out.println("o numero" +n+ " em algarismos romanos é  VII");
                break;
             case 8:
                System.out.println("o numero" +n+ " em algarismos romanos é  VIII");
                break;
             case 9:
                System.out.println("o numero" +n+ " em algarismos romanos é  IX");
                break;
             case 10:
                System.out.println("o numero" +n+ " em algarismos romanos é  x");
                break;

        
        }

scanner.close();
    }
}}

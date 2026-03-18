// Dentro do limite → "Sem multa"
// Até 20% acima → "Multa leve"
// Entre 20% e 50% acima → "Multa grave"
// Acima de 50% → "Multa gravíssima + suspensão"

import java.util.Scanner;

public class Ex19 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o limite da via: ");
        int rua = scanner.nextInt();
        System.out.println("informe sua velocidade: ");
        int velo = scanner.nextInt();
    
       if (velo <= rua){
        System.out.println("Voce esta dentro do limite");
       }else if(velo >= rua * 1.5){
        System.out.println("Multa gravissima, suspensão");
       }else if (velo >= rua * 1.2){
        System.out.println("voce esta levemente acima da velocidade, multa leve");
       }else{
        System.out.println("não é uma multa");
       }




    scanner.close(); 
    }}
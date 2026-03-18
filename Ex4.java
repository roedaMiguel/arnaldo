import java.util.Scanner;

public class Ex4 {
    //abaixo de 15 frio
    //entre 15 e 25 agradavel
    //acima de 25 quente
    public static void main(String[] args){
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos graus esta hoje: ");
    int temp = scanner.nextInt();

   if (temp < 15) {
    System.out.println("Frio");
} else if (temp <= 25) {
    System.out.println("Agradável");
} else {
    System.out.println("Quente");
}
   scanner.close();
}
}
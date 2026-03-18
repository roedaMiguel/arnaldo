import java.util.Scanner;

public class Ex3 {
        public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a media do aluno");
        int nota = sc.nextInt();

       if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5
) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}


sc.close();

}
}
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();

        if (ano /4 ==0){
        System.out.println("é um ano bissexto");
        }else if (ano /100 ==0){
            System.out.println("Nao é um ano bissexto");
        }else{
            System.out.println("não e um ano bissexto");
        }
        

    
    


    
    scanner.close();
    
    }}


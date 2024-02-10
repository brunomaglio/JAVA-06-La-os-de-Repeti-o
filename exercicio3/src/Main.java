import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade =0;
        int menor21=0;
        int maior50=0;

        while(idade>=0){
            System.out.println("Qual a idade? ");
            idade = scanner.nextInt();
            if(idade<21 && idade>=0){
                menor21++;

            } else if (idade>50) {
                maior50++;

            }
        }
        System.out.println("Total de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
    }
}
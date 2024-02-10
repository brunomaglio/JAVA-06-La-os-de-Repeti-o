import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Me de um numero: ");
        int menor = scanner.nextInt();
        System.out.println("Me de um numero maior que o primeiro: ");
        int maior = scanner.nextInt();


        if (menor > maior) {
            System.out.println("Intervalo inválido!");

        } else {

            System.out.println("No Intervalo entre " + menor + " e " + maior + ":");

            for (int i = menor; i <= maior; i++) {

                if (i % 3 == 0 && i % 5 == 0) {

                    System.out.println(i + " é múltiplo de 3 e 5!");
                }

            }

        }


    }
}
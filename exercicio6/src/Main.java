import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero, contador = 0, soma = 0;

        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero % 3 == 0 && numero != 0) {
                contador++;
                soma = soma + numero;

            }

        } while (numero != 0);

        float media = soma / contador;

        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}
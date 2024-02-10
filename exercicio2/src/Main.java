import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int par = 0,impar = 0;

        for(int i=0;i<10;i++){
            System.out.println("Digite um numero: ");
            int numero = scanner.nextInt();
            if(numero%2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Total de numeros pares: " + par);
        System.out.println("Total de numeros impares: " + impar);

    }
}
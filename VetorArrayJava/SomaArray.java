import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Criação de um array com 5 posições.
        int soma = 0;

        System.out.println("Digite 5 números:");

        // Loop para ler os números e armazená-los no array.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Loop para calcular a soma dos números.
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}

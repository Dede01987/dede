import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // número entre 1 e 100
        int tentativa;
        int tentativas = 0;

        System.out.println("🎯 Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (true) {
            System.out.print("Digite sua tentativa: ");

            // Validação de entrada
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, digite um número válido: ");
                scanner.next(); // descarta entrada inválida
            }

            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSecreto) {
                System.out.println("🎉 Parabéns! Você acertou em " + tentativas + " tentativas!");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("📉 Tente um número maior!");
            } else {
                System.out.println("📈 Tente um número menor!");
            }
        }

        scanner.close();
    }
}




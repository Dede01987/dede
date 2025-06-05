
import java.util.Scanner;

public class LeituradeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();


        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A idade digitada foi: " + idade);


        if (idade >= 0 && idade <= 10) {
            System.out.println(nome + " participará da categoria infantil.");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participará da categoria juvenil.");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participará da categoria pré-adulto.");
        } else if (idade >= 20) {
            System.out.println(nome + " participará da categoria adulto.");
        } else {
            System.out.println("Idade inválida.");
        }

        teclado.close();
    }
}
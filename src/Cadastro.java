
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        if ( nome.equals("")|| nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("usuario invalido");
        } else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}
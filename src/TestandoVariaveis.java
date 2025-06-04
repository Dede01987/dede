import java.util.Scanner;
public class TestandoVariaveis {
    public static void main(String[] args) {
//       String name = "olá como esto vcs estã'o?";
//        System.out.println(name);'

        System.out.println("Bom dia, tudo bem?");
        Scanner entrada = new Scanner(System.in);

        String resposta = entrada.nextLine();
        if(resposta.equals("sim")) {
            System.out.println("Que bom, que seja melhor ainda!");
        } else {
            System.out.println("Que pena, que melhore, meu amigo!");
        }
    }
}






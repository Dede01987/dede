import java.util.Scanner;

public class Alistamento {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();


            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo inválido. Digite apenas M ou F.");
                return;
            }


            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();


            if (sexo.equals("M")) {
                if (idade >= 18) {
                    System.out.println("Alistamento obrigatório.");
                } else {
                    System.out.println("Alistamento não permitido.");
                }
            } else if (sexo.equals("F")) {
                if (idade >= 18) {
                    System.out.print("Deseja se alistar? (S/N): ");
                    scanner.nextLine();
                    String resposta = scanner.nextLine().toUpperCase();
                    if (resposta.equals("S")) {
                        System.out.println("Alistamento voluntário solicitado.");
                    } else {
                        System.out.println("Alistamento não realizado.");
                    }
                } else {
                    System.out.println("Alistamento não é permitido.");
                }
            }

            scanner.close();
        }
    }

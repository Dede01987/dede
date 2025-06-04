public class torneidenatação {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 119;
        if (idade <= 10) {
            ;
            System.out.println(nome + " participara da categoria infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " participara da categoria juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " participara da categoria pré-adulto");
        } else {
            System.out.println(nome + " participara da categoria adulto");
        }

    }
}

public class ImpostodeRenda {
    public static void main(String[] args) {
        double salario = 2399D;
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.98 && salario <= 2399) {
            System.out.println("7.5% " + (salario * 0.075));
        } else if (salario >= 2826 && salario <= 3750) {
            System.out.println("15% " + (salario * 0.15));
        } else if (salario >= 3750 && salario <= 4664) {
           System.out.println("22.5% " + (salario * 0.225));
        } else {
            System.out.println("27.5% " + (salario * 0.275));

        }
    }
}

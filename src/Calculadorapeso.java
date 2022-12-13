import java.util.Scanner;

public class Calculadorapeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso inicial: ");
        float pesoInicial = scanner.nextFloat();

        System.out.println("Seu inicial é: " + pesoInicial);
    }
}

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continuarExecutando = "s";

        while (continuarExecutando.equalsIgnoreCase("s")){

            //System.out.println("Informe o ano atual: ");
            //int anoAtual = scanner.nextFloat();
            //anoAtual = 2022;
            int anoAtual = LocalDate.now().getYear();

            System.out.println("Informe o ano do seu nascimento: ");
            int anoNascimento = scanner.nextInt();
            //anoNascimento = 2000;

            System.out.println("Sua idade é de " + (anoAtual-anoNascimento) + " anos.");

            System.out.println("Deseja continuar executando o programa? (S/N)");
            scanner.nextLine();
            continuarExecutando = scanner.nextLine();

        }

    }
}
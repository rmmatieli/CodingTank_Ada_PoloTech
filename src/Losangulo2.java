import java.util.Scanner;

public class Losangulo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas da pirâmide centralizada: ");
        int linhas = scanner.nextInt();

        int ladoEsquerdo = linhas / 2;
        int ladoDireito = linhas + ladoEsquerdo;

        // int base = linhas - 1;

        int elementos = linhas/2 - 1;

        for (int i = 0; i < linhas - linhas/2; i++){

            // lado esquerdo
            for (int j = 0; j < ladoEsquerdo; j++){
                System.out.print("*");
            }

            // elementos (asteriscos)
            for (int j = 0; j < elementos; j++){

                System.out.print(" ");

            }

            //lado direito
            for (int j = linhas; j < ladoDireito; j++){
                System.out.print("*");
            }

            ladoEsquerdo += 1;
            ladoDireito += 1;

            //if (elementos)
            elementos -= 2;

            System.out.println();

        }

    }
}

import java.util.Scanner;

public class Losangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de colunas do losangulo (mínimo 5): ");
        int colunas = scanner.nextInt();

        int ladoEsquerdo = colunas/2;
        int ladoDireito = colunas + ladoEsquerdo;

        int elementos = 1; //espaços

        boolean flag = true; //flag para reverter segunda piramide do losangulo, fechando o losangulo e retirando espaços.

        for (int i = 0; i < colunas-1; i++){

            // primeira linha
            if (i==0){
                for (int j = 0; j < colunas; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            if (elementos < colunas && flag){
                // lado esquerdo
                for (int j = 0; j < ladoEsquerdo; j++){
                    System.out.print("*");
                }

                // elementos (espaços)
                for (int j = 0; j < elementos; j++){

                    System.out.print(" ");

                }

                //lado direito
                for (int j = colunas; j < ladoDireito; j++){
                    System.out.print("*");
                }

                ladoEsquerdo -= 1;
                ladoDireito -= 1;
                elementos += 2;

            }
            else {

                flag = false;

                elementos -= 4;
                ladoEsquerdo +=2;
                ladoDireito +=2;

                for (int j = 0; j < ladoEsquerdo; j++){
                    System.out.print("*");
                }

                // elementos (asteriscos)
                for (int j = 0; j < elementos; j++){
                    System.out.print(" ");
                }

                //lado direito
                for (int j = colunas; j < ladoDireito; j++){
                    System.out.print("*");
                }

                ladoEsquerdo -= 1;
                ladoDireito -= 1;
                elementos += 2;
            }

            System.out.println();
        }

    }

}

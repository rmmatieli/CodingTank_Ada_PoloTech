import java.util.Scanner;

public class PiramideCentralizada2 {

    // Solicite ao usuário que informe qual o tamanho, em linhas, da piramide.
    // Com o valor informado utilize o print para desenha uma piramide com a
    // quantidade de linhas de altura que foi informada pelo usuário
    // Exemplo:
    // Caso o usuário informe
    //   *
    //  ***
    // *****
    //Caso o usuário informe 5
    //     *
    //    ***
    //   *****
    //  *******
    // *********

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas da pirâmide centralizada: ");
        int linhas = scanner.nextInt();

        int ladoEsquerdo = linhas - 1;
        int ladoDireito = linhas + ladoEsquerdo;

       // int base = linhas - 1;

        int elementos = 1;

        for (int i = 0; i < linhas; i++){

            // lado esquerdo
            for (int j = 0; j < ladoEsquerdo; j++){
                System.out.print(" ");
            }

            // elementos (asteriscos)
            for (int j = 0; j < elementos; j++){

                System.out.print("*");

            }

            //lado direito
            for (int j = linhas; j < ladoDireito; j++){
                System.out.print(" ");
            }

            ladoEsquerdo -= 1;
            ladoDireito -= 1;
            elementos += 2;

            System.out.println();

        }

    }

}


/*
L1 C1
L2 C3 +2
L3 C5 +2
 */
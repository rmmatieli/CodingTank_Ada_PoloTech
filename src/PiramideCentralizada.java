import java.util.Scanner;

public class PiramideCentralizada {

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

        //int colunas = linhas + 2;

        //int mediana = (colunas + 1) / 2;
        String piramide;

        int controle = 0;

        int sucessor = 0;
        int antecessor = 0;

        int ordenador = linhas - 1;

        for (int i = 1; i <= linhas; i++){

           // mediana par
           // mediana impar

            for (int j = 1; j < i + 1; j++){

                System.out.print("*");

            }

            sucessor = linhas + 1;
            System.out.println();

        }

    }

}


/*
L1 C1
L2 C3 +2
L3 C5 +2
 */

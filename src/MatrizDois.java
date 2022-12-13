import java.util.Random;
import java.util.Scanner;

public class MatrizDois {

    public static void main(String[] args) {
        /*int tamanho = obtemTamanho();
        //int[][] quadrado = gerarQuadrados(tamanho);

        imprimeMatriz(quadrado);

       // int[] somaLinhas = totalDaLinha(quadrado);
        int[] somaColunas = totalDaColuna(quadrado);
        int maiorLinha = encontrarLinhaComMaiorSomatoria(somaLinhas);
        int maiorColuna = encontrarColunaComMaiorSomatoria(somaColunas);

        System.out.println("A linha com maior soma é a linha número " + maiorLinha);
        iprimeLinha(maiorLinha, quadrado);
        System.out.println("A linha com maior soma é a linha número " + maiorColuna);
        iprimeColuna(maiorColuna, quadrado);*/

        Random random = new Random();

        int[][] quadrado = {
                {
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                },
                {
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                },
                {
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                        random.nextInt(0, 10),
                }
        };

        imprimirMatriz(quadrado);

        int[] somaLinhas = totalDaLinha(quadrado);
        System.out.println();
        imprimeArray(somaLinhas);
        //        int[] somaColunas = totalDaColuna(quadrado);
        //        int maiorColuna = encontrarColunaComMaiorSomatoria(somaColunas);
        int maiorLinha = encontrarLinhaComMaiorSomatoria(somaLinhas);
        System.out.println();
        System.out.println("A posição da maior linha da Matriz é: " + maiorLinha);



    }

    private static int obtemTamanho() {
        Scanner entrada = new Scanner(System.in);
        int tamanho;
        do {
            System.out.println("Digite o tamanho da matriz quadrada.");
            tamanho = entrada.nextInt();
        } while (tamanho < 0);
        return tamanho;
    }

    private static int[][] gerarMatrizQuadrada(int tamanho) {
        int[][] matrizQuadrada = new int[tamanho][tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizQuadrada[i][j] = new Random().nextInt(10);
            }
        }
        return matrizQuadrada;
    }

    public static void imprimirMatriz(int[][] matriz) {
        //matriz.length me entrega quantas linhas eu tenho
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                System.out.print("[" + valorLinhaColuna + "]");
            }
            System.out.println();
        }
    }

    public static void imprimeArray(int[] array) {
        System.out.print("[");
        for (int i : array){
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    public static int[] totalDaLinha(int[][] matriz) {
        int[] resultado = new int[matriz.length];

        for (int linha = 0; linha < matriz.length; linha++) {

            int total = 0;

            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                total += valorLinhaColuna;
            }
            resultado[linha] = total;
        }

        return resultado;
    }

    public static int encontrarLinhaComMaiorSomatoria(int[] array) {

        int posicao = 0;
        int maior = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
                posicao = i;
            }
        }

        return posicao;
    }

    //imprime valores da maior Linha imprimirValorMaiorLinha(int linha, int[][] matriz);


    public static void imprimirColuna(int coluna, int[][] matriz) {
        // matriz.length me entrega quantas linhas eu tenho
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            // valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            int valorLinhaColuna = valorLinha[coluna];
            System.out.print("[" + valorLinhaColuna + "]");
            System.out.println();
        }
    }

    public static void imprimirLinha(int linha, int[][] matriz) {

    }

}

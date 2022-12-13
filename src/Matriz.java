import java.util.Random;

public class Matriz {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numeros = {
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
        };

        int[][] matrizDeInteiros = {
            {
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
            },
            {
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
            },
            {
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
            }

        };

        //imprimirMatriz(matrizDeInteiros);


        int[][] matrizAleatoria = new int[10][10];
        preencheMatriz(matrizAleatoria);
        imprimirMatriz(matrizAleatoria);
        System.out.println();

        System.out.println("O maior número da Matriz é: " + maiorNumero(matrizAleatoria));
        System.out.println("O menor número da Matriz é: " + menorNumero(matrizAleatoria));
        System.out.println("O valor médio da Matriz é: " + mediaMatriz(matrizAleatoria));



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

    public static void preencheMatriz(int[][] matriz) {
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 1000);
            }
        }
    }

    public static int maiorNumero(int[][] matriz) {
        int maior = -1;

        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];

            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                if (valorLinhaColuna > maior){
                    maior = valorLinhaColuna;
                }
            }
        }
        //System.out.println("O maior valor da Matriz é: " + maior);
        return maior;
    }

    public static double mediaMatriz(int[][] matriz) {

        int qtdeElementos = 0;
        double media = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                qtdeElementos += 1;
                media += valorLinhaColuna;
            }
        }

        media /= qtdeElementos;

        return media;
    }

    public static int menorNumero(int[][] matriz) {

        int menor = 1001;

        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];

                if (valorLinhaColuna < menor){
                    menor = valorLinhaColuna;
                }
            }
        }

        return menor;
    }

}

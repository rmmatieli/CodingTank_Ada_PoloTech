import java.util.Scanner;

    public class QuadradoPerfeitoComplexo {

        //Primeira Regra: Somente o número quadrado perfeito possui raiz quadrada exata.
        //Segunda Regra: Quando o número é quadrado perfeito, ele não possui como último algarismo os seguintes números: 2, 3, 7 e 8.
        //Terceira Regra: Todo número quadrado perfeito que for par possuirá raiz quadrada par. Ex.: 20² = 400
        //Lembre-se de que um número é considerado par quando for dividido por dois e resultar em um número inteiro."
        //Quarta Regra: Um número par será quadrado perfeito se, ao ser dividido por 4, resultar em um número inteiro.
        //Quinta Regra: Todo número quadrado perfeito que é ímpar possui raiz quadrada ímpar. Ex.: 7² = 49
        // Um número será ímpar quando ele for dividido por dois e resultar em um número que não é inteiro, ou seja, um número decimal."
        // "Sexta Regra: Ao dividir um número quadrado perfeito ímpar por oito, o resto sempre será o número 1."

        public static void main(String[] args) {
            int[][] matriz = montarEPreencheQuadradoPerfeito();
            //Escreva seu algoritmo aqui


            System.out.println("Valida linha: " + somaLinha(matriz));

        }

        public static int[][] montarEPreencheQuadradoPerfeito() {
        /*int[][] matriz = {
                {20,6,7,17},
                {9,15,14,12},
                {13,11,10,16},
                {8,18,19,3}
        };*/

            int[][] matriz = {
                    {6,32,3,34, 35, 1},
                    {7,11,27,28,8,30},
                    {19,14,16,15,23,24},
                    {18,20,22,21,17,13},
                    {25,29,10,9,26,12},
                    {36,5,33,4,2,31}
            };

            return matriz;
        }


        public static boolean somaLinha(int[][] matriz) {

            int[] valoresSomaLinha = new int[matriz.length];
            int[] valoresColuna = new int[matriz.length];
            int colunaAtual = 0;
            //System.out.println("valoresSoma = " + matriz.length);
            int somaLinha = 0;
            int somaColuna = 0;
            boolean ePerfeito = false;

            for (int linha = 0; linha < matriz.length; linha++) {

                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    //System.out.print("Linha: "+ linha + " Coluna: " + matriz[linha][coluna] + ", ");
                    somaLinha += matriz[linha][coluna];

                }
                valoresSomaLinha[linha] = somaLinha;
                //System.out.println("Soma linha: " + somaLinha);
                somaLinha = 0;

            }

            for (int i = 0; i < matriz.length; i++) {

                for (int linha = 0; linha < matriz.length; linha++) {

                    for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                        //System.out.print("Linha: "+ linha + " Coluna: " + matriz[linha][coluna] + ", ");

                        if (coluna == colunaAtual){
                            //valoresColuna[coluna] = matriz[linha][coluna];
                            somaColuna += matriz[linha][coluna];
                            //System.out.println("Valor linha " + linha + " Coluna " + coluna + " Valor x: " + matriz[linha][coluna]);
                            continue;

                        }
                        //somaLinha += matriz[linha][coluna];

                    }
                    //valoresSomaLinha[linha] = somaLinha;
                    //System.out.println("Soma linha: " + somaLinha);
                    //somaLinha = 0;

                }
                System.out.println("Soma coluna " + i + " = " + somaColuna);
                System.out.println("----------------------------");

                valoresColuna[i] = somaColuna;

                somaColuna = 0;
                colunaAtual += 1;
            }

            int posicaoInicial = valoresSomaLinha[0];

            for (int linha = 0; linha < valoresSomaLinha.length; linha++) {

                if (valoresSomaLinha[linha] == posicaoInicial){
                    ePerfeito = true;
                } else {
                    ePerfeito = false;
                    break;
                }

            }

            return ePerfeito;
        }

        public static boolean somaColuna(int [][] matriz) {

            int[] valoresSoma = new int[matriz.length];
            //System.out.println("valoresSoma = " + matriz.length);
            int somaLinha = 0;
            boolean ePerfeito = false;

            for (int linha = 0; linha < matriz.length; linha++) {

                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    //System.out.print("Linha: "+ linha + " Coluna: " + matriz[linha][coluna] + ", ");
                    somaLinha += matriz[linha][coluna];

                }
                valoresSoma[linha] = somaLinha;
                //System.out.println("Soma linha: " + somaLinha);
                somaLinha = 0;

            }

            int posicaoInicial = valoresSoma[0];

            for (int linha = 0; linha < valoresSoma.length; linha++) {

                if (valoresSoma[linha] == posicaoInicial){
                    ePerfeito = true;
                } else {
                    ePerfeito = false;
                    break;
                }

            }

            return ePerfeito;

        }

        public static void somaVertical(int [][] matriz) {

        }
    }


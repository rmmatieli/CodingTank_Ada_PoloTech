public class QuadradoPerfeito {

    public static void main(String[] args) {
        int[][] matriz = montarEPreencheQuadradoPerfeito();
        //Escreva seu algoritmo aqui

        if (validaQuadradoPerfeito(matriz)){
            System.out.println("A Matriz informada É um Quadrado Perfeito!");
        }else {
            System.out.println("A Matriz informada NÃO É um Quadrado Perfeito!");
        }
    }

    public static int[][] montarEPreencheQuadradoPerfeito() {
        int[][] matriz = {
                {20,6,7,17},
                {9,15,14,12},
                {13,11,10,16},
                {8,18,19,5}
        };

       /*int[][] matriz = {
                {6,32,3,34, 35, 1},
                {7,11,27,28,8,30},
                {19,14,16,15,23,24},
                {18,20,22,21,17,13},
                {25,29,10,9,26,12},
                {36,5,33,4,2,31}
        };*/

        return matriz;
    }


    public static boolean validaQuadradoPerfeito(int[][] matriz) {

        int[] valoresSomaLinha = new int[matriz.length];
        //System.out.println("valoresSoma = " + matriz.length);

        int somaLinha = 0;

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
}
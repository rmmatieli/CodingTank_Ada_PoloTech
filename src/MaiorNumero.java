import java.util.Random;

public class MaiorNumero {
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

        int maior = -1;
        int menor = 101;
        double media = 0;

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }

            media += numeros[i];

            /*if (i < numeros.length - 1){
                System.out.print(numeros[i] + ", ");
            }else {
                System.out.print(numeros[i]);
            }*/


        }

        //System.out.println("\n" + media);
        media = media / numeros.length;

        System.out.print("Array origem: ");
        imprimeArray(numeros);
        System.out.print("\nArray invertido: ");
        imprimeArray(inverteArray(numeros));

        System.out.println("\n" + "O maior número do array é " + maior + " e o menor número é " + menor);
        System.out.println("A media é " + media);

    }

    public static void imprimeArray(int[] array) {
        System.out.print("[");
        for (int i : array){
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    public static int[] inverteArray(int[] array) {

        int[] arrayInvertido = new int [array.length]; //10
        int posicaoAtual = 0; //10

        for (int i = array.length - 1; i > -1; i--){
            arrayInvertido[posicaoAtual] = array[i];
            //System.out.println("posicao: " + i);
            //System.out.println("numero: " + arrayInvertido[count]);
            posicaoAtual += 1;
        }
        return arrayInvertido;
    }
}

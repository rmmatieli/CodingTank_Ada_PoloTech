import java.util.Random;
import java.util.Scanner;

public class OrdenacaoArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do array: ");
        int tamanhoArray = scanner.nextInt();

        int[] array = geraArray(tamanhoArray);
        System.out.println("Array ANTES da ordenação crescente: ");
        imprimeArray(array);

        ordenaArray(array);
        System.out.println("\n" + "----".repeat(tamanhoArray));
        System.out.println("Array DEPOIS da ordenação crescente: ");
        imprimeArray(array);

    }

    public static int[] geraArray(int tamanho) {
        Random random = new Random();

        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(0,100);
            //System.out.println(array[i]);
        }

        return array;
    }

    public static void imprimeArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("]");
    }

    public static int[] ordenaArray(int[] array) {

        int auxiliar = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++){

                if (array[i] < array[j]){  // Verifica se o próximo valor do array é menor que atual e faz a troca;
                    auxiliar = array[j];
                    array[j] = array[i];
                    array[i] = auxiliar;
                }
            }
        }
        return array;
    }

}

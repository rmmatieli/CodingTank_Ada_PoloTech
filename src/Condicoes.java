import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {

        //Entrada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        float primeiroNum = scanner.nextFloat();

        System.out.println("Informe o segundo número: ");
        float segundoNum = scanner.nextFloat();

        System.out.println("Informe o simbolo da operação desejada: ");
        scanner.nextLine();
        String operacao = scanner.nextLine();

        //Soma
        if (operacao.equalsIgnoreCase("+") || operacao.equals("1")){

            float resultado = primeiroNum + segundoNum;
            System.out.println("O resultado da operação de soma é: " + resultado);

        }

        //Subtração
        if (operacao.equalsIgnoreCase("-") || operacao.equals("2")){

            float resultado = primeiroNum - segundoNum;
            System.out.println("O resultado da operação de subtração é: " + resultado);

        }

        //Multiplicação
        if (operacao.equalsIgnoreCase("*") || operacao.equals("3")){

            float resultado = primeiroNum * segundoNum;
            System.out.println("O resultado da operação de multiplicação é: " + resultado);

        }

        //Divisão
        if (operacao.equalsIgnoreCase("/") || operacao.equals("4")){

            float resultado = primeiroNum / segundoNum;
            System.out.println("O resultado da operação de divisão é: " + resultado);

        }

        float resultado = 0;

        switch (operacao){
            case "+":
                resultado = primeiroNum + segundoNum;
                System.out.println("O resultado da operação de soma é: " + resultado);
                break;
            case "-":
                resultado = primeiroNum - segundoNum;
                System.out.println("O resultado da operação de soma é: " + resultado);
                break;
            case "*":
                resultado = primeiroNum * segundoNum;
                System.out.println("O resultado da operação de soma é: " + resultado);
                break;
            case "/":
                resultado = primeiroNum / segundoNum;
                System.out.println("O resultado da operação de soma é: " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
                break;

        }


    }
}

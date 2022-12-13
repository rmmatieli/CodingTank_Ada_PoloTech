import java.util.Scanner;

public class DescontoLojistaDois {
    /*2 - A loja "Tudo mais barato" esta fazendo uma liquidação de inverno e para isso deve ser aplicado um desconto de 10% sobre o valor de venda das calças, 20% sobre o valor das botas e 40% sobre o valor das blusas e também dos cachecóis.
          Para isso deve ser solicitado ao usuário que informe o tipo da roupa e também o valor atual. Com as informações obtidas deve ser calculado qual o novo valor de venda do produto*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de roupa (calça, bota, blusa e cachecol): ");
        String roupa = scanner.nextLine();

        System.out.println("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double valorVenda = 0;
        double desconto = 0;

        switch (roupa){
            case "calça" -> {
                desconto = 0.9;
                valorVenda =  valorProduto * desconto;
            }
            case "bota" -> {
                desconto = 0.8;
                valorVenda = valorProduto * desconto;
            }
            case "blusa","cachecol" -> {
                desconto = 0.6;
                valorVenda = valorProduto * desconto;
            }
            default -> {
                System.out.println("Produto inválido!");
                System.exit('1');
            }
        }

        System.out.println("O valor de venda final do produto " + roupa + " com desconto de " + (desconto*100) + "% é de R$ " + valorVenda);
    }
}

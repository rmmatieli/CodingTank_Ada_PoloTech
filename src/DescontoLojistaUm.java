import java.util.Scanner;

public class DescontoLojistaUm {
    public static void main(String[] args) {
       /*1 - Um lojista deseja saber qual o valor da mercadoria ao aplicar um desconto de 5% sobre o preço de venda.
          Para isso deve ser solicitado ao usuário que informe o valor de venda do produto e aplicado o percentual de desconto proposto*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double valorVenda = (valorProduto * 0.95);

        System.out.println("O produto com desconto de 5% é de: " + valorVenda);

    }
}

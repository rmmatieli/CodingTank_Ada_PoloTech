public class Banco {
    public static void main(String[] args) {

    /*1 - A Sra. Maria deve 10 mil reais para o banco 'Seu dinheiro é nossa alegria', à uma taxa de juro de 0,99% ao mês.
    Após ter juntado o equivalente a R$ 2.398,00 ela decidiu aplicar em um investimento de juros compostos, esse com taxa de 1,3% ao mês.
    Escreva um algoritmo de calcule a quantidade de meses que será necessário até que o investimento pague a dívida.
    Neste caso é direto mesmo, sem input de usuário nem nada, apenas o algoritmo com laços para calcular a quantidade de meses.*/

    double divida = 10000;
    double taxaDivida = 0.0099;

    double investimento = 2398;
    double taxaInvestimento = 0.015;

    int meses = 0;

    while (investimento < divida){

        investimento *= 1 + taxaInvestimento;

        divida *= 1 + taxaDivida;

        meses++;

    }

        System.out.println("Divida: " + divida);

        System.out.println("Investimento: " + investimento);

        System.out.println("Meses: " + meses);

    }
}

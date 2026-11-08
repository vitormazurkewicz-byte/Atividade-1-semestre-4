import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;
        double taxa;
        double valores[] = new double[12];
        System.out.println("digite o valor do emprestimo:");
        valor = sc.nextDouble();
        System.out.println("digite a taxa de juros mensal:");
        taxa = sc.nextDouble();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valor + valor * taxa / 100 * (i + 1);
            System.out.printf("mes %d: r$ %.2f%n", (i + 1), valores[i]);
        }
        sc.close();
    }
}

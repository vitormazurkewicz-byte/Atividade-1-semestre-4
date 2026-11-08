import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        double precos[];
        int quantidades[];

        double subtotal;
        double total = 0;
        double desconto = 0;
        double valorFinal;

        System.out.println("digite a quantidade de itens:");
        n = sc.nextInt();

        if (n < 1) {

            System.out.println("quantidade invalida");

            sc.close();
            return;
        }

        precos = new double[n];
        quantidades = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("digite o preco unitario:");
            precos[i] = sc.nextDouble();

            System.out.println("digite a quantidade:");
            quantidades[i] = sc.nextInt();

        }

        for (int i = 0; i < n; i++) {

            subtotal = precos[i] * quantidades[i];

            total += subtotal;

            System.out.printf("subtotal do item %d: r$ %.2f%n", (i + 1), subtotal);
        }

        if (total > 200) {
            desconto = total * 0.05;
        }

        valorFinal = total - desconto;

        System.out.printf("total da compra: r$ %.2f%n", total);
        System.out.printf("desconto: r$ %.2f%n", desconto);
        System.out.printf("valor final a pagar: r$ %.2f%n", valorFinal);

        sc.close();
    }
}

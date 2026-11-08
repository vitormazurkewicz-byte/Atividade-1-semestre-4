import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigos[] = {101, 205, 310, 420, 550};

        double precos[] = {4.50, 12.00, 7.90, 25.00, 3.20};

        int codigo;
        boolean encontrado = false;

        System.out.println("digite o codigo do produto:");
        codigo = sc.nextInt();

        for (int i = 0; i < codigos.length; i++) {

            if (codigo == codigos[i]) {

                System.out.printf("preco do produto: r$ %.2f%n", precos[i]);

                encontrado = true;

                break;
            }
        }

        if (!encontrado) {
            System.out.println("produto nao encontrado");
        }

        sc.close();
    }
}

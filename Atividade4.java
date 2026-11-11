import java.util.Scanner;
public class tete4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("informe a " + (i + 1) + " nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        if ((soma / notas.length) >= 6) {
            System.out.println("aprovado com media 6");
        }
        else  {
            System.out.println("reprovado.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notas[] = new double[10];

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota:");
            notas[i] = sc.nextDouble();
            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }
        System.out.println("aprovados: " + aprovados);
        System.out.println("recuperacao: " + recuperacao);
        System.out.println("reprovados: " + reprovados);
        sc.close();
    }
}

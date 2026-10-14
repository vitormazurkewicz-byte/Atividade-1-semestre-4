import java.util.Scanner;
//3. Ler as 4 notas de um aluno. Imprimir a média com duas
//casas e a situação: aprovado com média maior ou igual a 6 e
//reprovado abaixo disso.
public class tete4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        if ((soma / notas.length) >= 6) {
            System.out.println("aprovado com média maior ou igual a 6");
        }
        else  {
            System.out.println("reprovado abaixo da media.");
        }

        sc.close();
    }
}

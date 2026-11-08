import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salarios[] = new double[6];
        double soma = 0;
        double media;
        double maior = 0;
        double menor = 0;
        int acimaMedia = 0;
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("digite o salario do funcionario:");
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
            if (i == 0) {
                maior = salarios[i];
                menor = salarios[i];
            }
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        media = soma / salarios.length;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acimaMedia++;
            }
        }
        System.out.printf("maior salario: r$ %.2f%n", maior);
        System.out.printf("menor salario: r$ %.2f%n", menor);
        System.out.printf("media salarial: r$ %.2f%n", media);
        System.out.println("funcionarios acima da media: " + acimaMedia);
        sc.close();
    }
}

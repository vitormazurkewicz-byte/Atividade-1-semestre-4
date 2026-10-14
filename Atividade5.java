import java.util.Scanner;

//Ler o preço de 5 produtos. Imprimir todos os preços lidos
//e, ao final, o total da compra com duas casas.
public class tete5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        int g = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        while (g < 5){
            System.out.println("o " + (g + 1) + " produto , o valor é " + notas[g]);
            g++;
        }
        System.out.println("a Soma total: " + soma);


        sc.close();
    }
}

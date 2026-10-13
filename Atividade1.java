import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class tete2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double  notas[] = {7.5, 6.0, 8.0, 5.5};
        double soma = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;

        System.out.println("A soma das notas é" + soma + " a primeira nota é " + notas[0] + " a ultima nota é " + notas[3]);

    }
}

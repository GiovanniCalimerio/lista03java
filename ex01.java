package lista03java;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int anos = 0;
        float a, b;
        System.out.println("Informe o n�mero de hab. do pa�s A: ");
        a = (float) sc.nextFloat ();
        System.out.println("Informe o n�mero de hab. do pa�s B: ");
        b = (float) sc.nextFloat ();
        while (a <= b) {
            a = (float) (a * 0.03);
            b = (float) (b * 0.0015);
            anos = (int) (anos + 1);
        }
        System.out.println("O pa�s A iguala ou ultrapassa o pa�s B em " + anos + " anos!");
    }
}
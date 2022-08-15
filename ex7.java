package lista03java;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, soma;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 5 números: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        soma = n1 + n2 + n3 + n4 + n5;
        media = (n1 + n2 + n3 + n4 + n5) / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

    }
}
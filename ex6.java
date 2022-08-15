package lista03java;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[]= new int[5];
        int maior = 0;

        for(int i=0;i<5;i++){
            System.out.print("Entre com o número : ");
            a[i] = sc.nextInt();

            if (a[i]>maior)
            {
                maior = a[i];
            }
        }
        System.out.println("O maior numero e " + maior);
    }
}
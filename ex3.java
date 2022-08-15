package lista03java;

public class ex04 {
    public static void main(String[] args) {
        int anos = 0;
        float n1 = 80000 , n2 = 200000;
        while  (n1 <= n2){
            n1 = (float) (n1 * 0.03);
            n2 = (float) (n2 * 0.015);
            anos = (int) (anos + 1);
        }
        System.out.println("O país A iguala ou ultrapassa o B em " + anos + " anos!");
    }
}
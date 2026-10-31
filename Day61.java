import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        System.out.println("masukkan angka n");
        int n = scc.nextInt();

        long hasil = 1 ;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        System.out.println("hasil perkalian 1 samapa " + n + " = " + hasil);
    }
}

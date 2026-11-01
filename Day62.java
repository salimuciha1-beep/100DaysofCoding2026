import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nilai N");
        int n = sc.nextInt();

        for (int baris = 1; baris <= n; baris++) {
            for (int kolom = 1; kolom <= n; kolom++) {
                System.out.print((baris * kolom) + "\t");
            }
            System.out.println();
        }

    }
}

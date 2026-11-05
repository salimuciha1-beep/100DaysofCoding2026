import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan panjang garis");
        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            System.out.println("|");
        }
    }
}

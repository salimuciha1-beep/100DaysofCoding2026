import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan nilai M ");
        int m = sc.nextInt();
        System.out.println("masukkan nilai pangkat N");
        int n = sc.nextInt();

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }
        System.out.println(m +" pangkat " + n + " = " + hasil);
    }
}

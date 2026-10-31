import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nilai N");
        int n = sc.nextInt();
        System.out.println("masukkan nilai M");
        int m = sc.nextInt();
        
        System.out.println("kelipatan m dan n");
        for (int i = n; i >= 1; i--) {
            if (i % m == 0) {
                System.out.print(i +" ");
            }
        }
    }
}

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai N");
        int n = sc.nextInt();

        System.out.println("bilangan ganjil");
        for (int i = n; i >= 1; i--) {
            if (i %2 != 0) {
            System.out.print(i + " ");     
            }
        }
        System.out.println();

        System.out.println("bilangan genap");
        for (int i = n; i >= 2; i --) {
           if (i %2 == 0) {
            System.out.print(i + " ");   
            }
        }
        System.out.println();
    }
}

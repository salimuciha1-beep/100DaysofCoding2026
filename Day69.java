import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan panjang");
        int x = sc.nextInt();
        
        System.out.println("masukkan luas");
        int y = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("* ");
         
            }
            System.out.println();
        }


    }
}

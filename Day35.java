import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("masukkan nilai A : ");
        int a = sc.nextInt();
        System.out.printf("masukkan nilai B : ");
        int b = sc.nextInt();
        System.out.printf("masukkan nilai C : ");
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                System.out.println("nilai terbesar : " + a);
            } else {
                System.out.println("nilai terbesar : " + c);
            }
        }else{
            if (b >= c) {
                System.out.println("nilai terbesar : " + b);
            } else {
                System.out.println("nilai terbesar : " + c);
            }
        }
    }
}

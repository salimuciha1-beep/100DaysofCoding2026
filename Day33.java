import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("masukkan nilai : ");
        int a = sc.nextInt();

        if (a >= 60) {
            System.out.println("lulus");

        }else{
            System.out.println("tidak lulus");
        }
    }
}

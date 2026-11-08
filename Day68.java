import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("masukkan panjang garis");
        int x = sc.nextInt();

        System.out.println("garis horizontal");
        for (int i = 1; i <= x; i++) {
            System.out.print("*");
        }
          System.out.println();

        System.out.println("garis vertikal");
        for (int i = 1; i <= x; i++) {
          System.out.println("*");
        }

        System.out.println();
        System.out.println("persegi");
        for (int i = 0; i < x; i++) {
          for (int j = 0; j < x; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
        }
    }


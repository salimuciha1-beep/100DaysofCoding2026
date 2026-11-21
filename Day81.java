import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan banyak data");
        int x = sc.nextInt();

        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            System.out.print("data ke " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }

        System.out.println("isi array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("data ke " + i + " = " + array[i]);
        }
    }
}

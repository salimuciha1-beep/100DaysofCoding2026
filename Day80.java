import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int[] nilai = {20, 30, 19, 45};
        System.out.println("isi array ");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("angka ke " + i + " = " + nilai[i]);
    }

    System.out.println("masukkan index yang di ganti (0-3)");
    int index = sc.nextInt();

    if (index >= 0 && index < nilai.length) {
        System.out.println("ubah menjadi : ");
        nilai[index] = sc.nextInt();

         System.out.println("isi array setelah di ubah ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("angka ke " + i + " = " + nilai[i]);
    }
    }else {
        System.out.println("index tidak valid");
    }
}
}

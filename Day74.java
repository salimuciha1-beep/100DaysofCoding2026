import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan text");
        String text = sc.nextLine();

        System.out.println("teks awal   : " + text);
        System.out.println("panjang     : " + text.length());
        System.out.println("huruf besar : " + text.toUpperCase());
        System.out.println("huruf kecil : " + text.toLowerCase());

    }
}

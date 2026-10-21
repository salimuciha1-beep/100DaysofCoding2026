import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka : ");
        int nilai = sc.nextInt();

        String jumlah = (nilai % 2 == 0 ? "genap" : "ganjil" );
        System.out.println(nilai + " bilangan ini " + jumlah);
        }
    }


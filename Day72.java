import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int angka = 0;

        while (angka >= 0){
            System.out.print("masukkan angka negatif  untuk berhenti: ");
            angka = sc.nextInt();

            if (angka >= 0 ) {
                total += angka;
            }
        }
        System.out.println("total penjumlahan: " + total);
        
    }
}

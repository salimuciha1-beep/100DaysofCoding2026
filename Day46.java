import java.util.Scanner;

public class Day46 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("==menu kantin==");
    System.out.println("1. ayam geprek  Rp.15.000");
    System.out.println("2. nasi goreng  Rp.13.000");
    System.out.println("3. nasi kuning  Rp.10.000");
    System.out.println("pilih : ");
    int pilih = sc.nextInt();
    System.out.println("jumlah porsi : ");
    int jumlah = sc.nextInt();

    String nama = "";
    int harga = 0;
    
    switch (pilih) {
        case 1:
            nama = "ayam geprek";
            harga = 15000;
            break;
    
        case 2:
            nama = "nasi goreng";
            harga = 13000;
            break;
    
        case 3:
            nama = "nasi kuning";
            harga = 10000;
            break;
    
        default:
            System.out.println("tidak ada dalam menu");
            break;
    }
    if (harga > 0) {
        int total = harga * jumlah;
        System.out.println("pesanan " + nama + " x " + jumlah);
        System.out.println("total    Rp:." +total);
    }
    
   } 
}

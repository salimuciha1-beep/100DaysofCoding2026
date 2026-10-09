import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===MENU MAKANAN===");
        System.out.println("1. ayam geprek    -Rp 15.000");
        System.out.println("2. nasi goreng    -Rp 18.000");
        System.out.println("3. nasi campur    -Rp 20.000");
        System.out.println("pilih menu anda");
        int pesanan = sc.nextInt();

        System.out.println("jumlah porsi : ");
        int jumlah = sc.nextInt();

        String nama;
        int harga;

        if (pesanan == 1 ) {
            nama = "ayam geprek";
            harga = 15000; 
        }else if (pesanan == 2){
            nama = "nasi goreng";
            harga = 18000;
        }else if (pesanan == 3){
            nama = "nasi campur";
            harga = 20000;
        }else{
            System.out.println("tidak ada dalam menu kami");
            return;
        }

        int total = harga * jumlah;
        System.out.println("pesanan : " + nama + "x" + jumlah);
        System.out.println("total : Rp." + total);

    }
}

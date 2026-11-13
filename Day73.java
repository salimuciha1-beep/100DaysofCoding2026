import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("== menu ==");
            System.out.println("1. makanan");
            System.out.println("2. minuman");
            System.out.println("3. keluar");
            System.out.print("pilih menu");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.println("nasi kuning, nasi goreng, dll");
            }else if (pilihan == 2){
                System.out.println("es teh, jus jeruk, dll");
            }else if (pilihan != 3) {
                System.out.println("menu tidak tersedia");
            }
        }while (pilihan != 3);

            System.out.println("program selesai");
        
    }
}

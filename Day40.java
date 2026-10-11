import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai");
        int nilai = sc.nextInt();

        if (nilai > 0) {
            System.out.println("nilai positif : " + nilai);

            if (nilai %2 == 0) {
                System.out.println("akngka genap  " + nilai);
            } else {
                System.out.println("angka ganjil  " + nilai);
            }
        }else if (nilai < 0) {
            System.out.println("nilai negatif : " + nilai);
        }else{
            System.out.println("bilangan nol : " + nilai);
        }
         
        if (nilai >= 1 && nilai <= 100) {
            System.out.println("berada di natara angka 1 sampai 100");
        }else{
            System.out.println("tidak ada di dalam 1 dan 100");
        }

        System.out.println("angka di tambah : " + (nilai + 1));
        System.out.println("angka di kurang : " + (nilai - 1));
    }
}

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan gaji pokok : ");
        int gajiPokok = sc.nextInt();

        double tunjangan = 0.10 * gajiPokok;
        double gajikotor = gajiPokok + tunjangan;
        double pajak;

        if (gajiPokok < 3000000) {
            pajak = 0;
        }else if (gajikotor <= 5000000){
            pajak = 0.05 * gajikotor;
        }else{
            pajak = 0.10 * gajikotor;
        }

        double gajibersih = gajikotor - pajak;

        System.out.println("gaji pokok  : " + gajiPokok);
        System.out.println("tunjangan   : " + tunjangan);
        System.out.println("gaji kotor  : " + gajikotor);
        System.out.println("pajak       : " + pajak);
        System.out.println("gaji bersih : " + gajibersih);
    }
}

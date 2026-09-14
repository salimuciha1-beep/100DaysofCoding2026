import java.util.Scanner;

public class Soal4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("masukkan usia penonton");
    int usia = input.nextInt();
    System.out.printf("masukkan pembawa ktp");
    boolean ktp = input.nextBoolean();
    System.out.printf("masukkan pembeli tiket");
    boolean tiket = input.nextBoolean();

    System.out.printf("data penoton %n");
    System.out.printf("usia        : %d tahun %n", usia ); 
    System.out.printf("punya ktp   : %b %n",ktp );
    System.out.printf("punya tiket : %b",tiket);
  }  
}

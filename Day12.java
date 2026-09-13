import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan nama :");
        String nama = input.nextLine();
        System.out.println("masukkan umur : ");
        int umur = input.nextInt();
        System.out.println("masukkan jenis kelamin :");
        char jenis = input.next().charAt(0);
        System.out.println("masukkan TB :");
        double tinggi = input.nextDouble();
        System.out.println("masukkan BB :");
        Float berat = input.nextFloat();

        System.out.println("biodata diri");
        System.out.println("nama saya : " + nama);
        System.out.println("umur saya : " + umur + "tahun");
        System.out.println("jenis kelamin : " + jenis);
        System.out.println("tinggi badan saya : " + tinggi);
        System.out.println("berat badan saya : " + berat);

    }
}

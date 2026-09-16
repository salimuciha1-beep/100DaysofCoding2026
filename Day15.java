import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan harga roti :");
        double hargaroti = input.nextDouble();
        System.out.println("masukkan jumlah roti : ");
        double jumlahroti = input.nextDouble();
        double totalharga = hargaroti*jumlahroti;
        System.out.println("total harga roti :RP " + totalharga);
        System.out.println();
        System.out.println("masukkan harga pitza");
        double hargapitza = input.nextDouble();
        System.out.println("masukkan jumlah orang :");
        double jumlahorang = input.nextDouble();
        double totalperorang = hargapitza/jumlahorang;
        System.out.println("total yang dibayar perorang :RP " + totalperorang);
    }
}

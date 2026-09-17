import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumalah siswa");
        int siswa = input.nextInt();
        System.out.println("masukkan julah bus");
        int bus = input.nextInt();
        
        int buspenuh = siswa / bus;
        System.out.println("bus terisih penuh :" + buspenuh);

        int sisa = siswa % bus;
        System.out.println("tidak memnuhi bus :" + sisa);
    }
}

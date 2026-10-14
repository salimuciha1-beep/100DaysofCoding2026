import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nilai");
        int nilai = sc.nextInt();

        if (nilai % 3 == 0 && nilai % 5 == 0){
            System.out.println("kelipatan 3 dan 5: " + nilai);
        }else if (nilai % 3 == 0){
            System.out.println("kelipata 3 : " + nilai);
        }else if (nilai % 5 == 0) {
            System.out.println("kelipatan 5 : " + nilai);
        }else {
            System.out.println("bukan kelipatan 3 dan 5");
        }
    }
}

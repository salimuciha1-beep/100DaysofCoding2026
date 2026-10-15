import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai");
        int nilai = sc.nextInt();

        if (nilai >= 85) {
            System.out.println(nilai + " : dapat A");
        }else if (nilai >= 75){
            System.out.println(nilai + " : dapat B");
        } else if (nilai >= 55){
            System.out.println(nilai + " : dapat C");
        } else if (nilai >= 45){
            System.out.println(nilai + " : dapat D");
        }else{
            System.out.println(nilai + " : dapat E");
        }
    }
}

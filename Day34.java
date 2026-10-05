import java.util.Scanner;

public class Day34 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("masukkan nilai ijian");
    int nilai = sc.nextInt();

    if (nilai >= 90) {
       System.out.println("A"); 
    }else if (nilai >= 50){
        System.out.println("B");
    }else{
        System.out.println("E");
    }
}
}

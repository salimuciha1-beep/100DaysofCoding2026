import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("masukkan bilangan : ");
        int bilangan = sc.nextInt();

        if (bilangan > 0) {
            System.out.println("bilangan positif : " + bilangan);
        }else if (bilangan < 0){
            System.out.println("bilangan negatif : " + bilangan);
        }else{
            System.out.println("bilangan nol : " + bilangan);
        }
    }
}

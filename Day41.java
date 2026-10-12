import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan suhu : ");
        int suhu = sc.nextInt();

        if (suhu < 15) {
            System.out.println("suhu " + suhu + "°C : dingin");
        }else if (suhu < 25 ){
            System.out.println("suhu " + suhu + "°C : sedang");
        }else if (suhu <= 30){
            System.out.println("suhu " + suhu + "°C : normal");
        }else{
            System.out.println("suhu " + suhu + "°C : panas");
        }
    }
}

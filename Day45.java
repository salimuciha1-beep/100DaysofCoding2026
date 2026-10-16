import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan huruf A-E : ");
        char huruf  = sc.next().charAt(0);
        switch(huruf){
            case 'A':
                System.out.println("sangat baik");
                break;
            case 'B':
                System.out.println("baik");
                break;
            case 'C':
                System.out.println("cukup");
                break;
            case 'D':
                System.out.println("kurang");
                break;
            case 'E':
                System.out.println("sangat kurang");
                break;
            default:
                System.out.println("huruf tidak ada");
        }
    }
}

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka pertama");
        int a = sc.nextInt();

        System.out.println("masukkan angka operator");
       char op = sc.next().charAt(0);
       
        System.out.println("masukkan angka kedua");
        int b = sc.nextInt();
        switch (op) {
            case '+':
                System.out.println("hasil : " + (a + b));
                break;
        
            case '-':
                System.out.println("hasil : " + (a - b));
                break;
        
            case '*':
                System.out.println("hasil : " + (a * b));
                break;
        
            case '/':
                if ( b == 0){
                    System.out.println("tidak bisa di bagi dengan 0");
                }else{
                System.out.println("hasil : " + (a / b));
                }
                break;
        
            default:
                System.out.println("operator tidak ada");
                break;
        }
    }
}

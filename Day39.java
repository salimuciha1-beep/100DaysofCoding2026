import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka pertama : ");
        int angka1 = sc.nextInt();
        System.out.print("masukkan operator : ");
        char op = sc.next().charAt(0);
        System.out.print("masukkan angka kedua : ");
        int angka2 = sc.nextInt();

        if (op == '*') {
            System.out.println(angka1 + "*" + angka2 + "=" + (angka1 * angka2));
        }else if (op == '+') {
            System.out.println(angka1 + "+" + angka2 + "=" + (angka1 + angka2));
        }else if (op == '-') {
            System.out.println(angka1 + "-" + angka2 + "=" + (angka1 - angka2));
        }else if (op == '/'){
            if (op != 0) {
                System.out.println(angka1 + "/" + angka2 + "=" + (angka1 / angka2));
                
            } else {
                System.out.println("error");
            }
        }else{
            System.out.println("opertor tidak valid");
        }
    }
}

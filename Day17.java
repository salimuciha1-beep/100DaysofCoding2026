import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 0;
System.out.println("masukkan tunai :");
int a = input.nextInt();
saldo =+ a;


System.out.println(" penarikan :" );
int b = input.nextInt();
saldo -= b;


System.out.println("masukkan tabungan :");
int c = input.nextInt();
saldo *= c;


System.out.println(" pembagi saldo");
int d = input.nextInt();
saldo /= d;

System.out.println("angka modulus :");
int e = input.nextInt();
saldo %= e;


System.out.println("setelah stor tuani :" + saldo);
System.out.println("setelah penarikan : " + saldo);
System.out.println("setelah bunga tabungan :" +saldo);
System.out.println("setelah dibagi : " + d+ ": " + saldo);
System.out.println("sisa setelah modulus : " + e + ": " + saldo);

    }
}

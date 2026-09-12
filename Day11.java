import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        
    
       Scanner input = new Scanner(System.in);

       System.out.println("masukkan nama anda : ");
       String nama = input.nextLine();

       System.out.println("masukkan  umur anda : ");
       int umur = input.nextInt();

       System.out.println("nama saya : " + nama);
       System.out.println("umur saya : " + umur);
    }
       
}

//scanner berfungsi sebagai pemantau dari aliran data stream dari keyboard system.in

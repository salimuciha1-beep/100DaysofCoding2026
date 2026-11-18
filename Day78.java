import java.util.Scanner;

public class Day78 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("buat akun ");
    System.out.print("Buat username : ");
    String buatuser = sc.nextLine();
    System.out.print("Buat password : ");
    String buatpass = sc.nextLine();
    System.out.println("akun berhasil dibuat");


     System.out.print("login");
     boolean berhasil = false;

     while (!berhasil) {
         System.out.print("username : ");
         String user = sc.nextLine();
         System.out.print("password : ");
         String pass = sc.nextLine();

         if (user.equals(buatuser) && pass.equals(buatpass)) {
            berhasil = true;
            System.out.println("login berhasil, selamat datang : " + user);
         }else {
            System.out.println("username atau password tidak valid");
         }
     }
  }  
}

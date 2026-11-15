import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("masukkan kata ke-1");
      String kata1 = sc.nextLine();
      System.out.println("masukkan kata ke-2");
      String kata2 = sc.nextLine();

      System.out.println("equals               : " + kata1.equals(kata2));
      System.out.println("equalsIgnoreCase     : " + kata1.equalsIgnoreCase(kata2));
      System.out.println("contains             : " + kata1.contains(kata2));
      System.out.println("kata pertama kosong? :" + kata1.isEmpty());
      System.out.println("kata kedua kosong?   :" + kata2.isEmpty());
    }
}

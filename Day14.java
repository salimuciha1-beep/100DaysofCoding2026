import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("uang tabungan awal");
       double tabunganAwal = input.nextDouble();
       System.out.println("uang dari ayah");
       double uangayah = input.nextDouble();
       System.out.println("uang  dari ibu");
       double uangibu = input.nextDouble();
    
       double uangyangtersisa = tabunganAwal+uangayah+uangibu;
       System.out.println("uang tabungan riang saat ini" + uangyangtersisa);
       System.out.println("riang membeli buku");
       double bukuriang = input.nextDouble();

       double sisauang = uangyangtersisa-bukuriang;
       System.out.println("sisa uang riang" + sisauang);




    }
}

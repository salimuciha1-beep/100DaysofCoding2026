public class Day22 {
    public static void main(String[] args) {
        int a = 30;
        int b = 15;
        System.out.println("semua ditukar a: " + a + " b " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("sesudah ditukar a :" + a + " b " + b);
    }
}

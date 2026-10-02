public class Day31 {
    public static void main(String[] args) {
        int a = 19;
        boolean b = true;
        int c = 50;
        boolean d = true;
        boolean e = false;
        
        boolean hasil = ( a >= 17) && b;
        System.out.println("ambil ktp :" + hasil);

        boolean lulus = (c >= 60) || d;
        System.out.println("sudah lulus :" + lulus);

        boolean jalan2 = !e;
        System.out.println("boleh jalan :" + jalan2);
    }
}

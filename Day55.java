public class Day55 {
    public static void main(String[] args) {
        System.out.println("contoh continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5){
            continue;
            }
            System.out.println(i);
        }

        System.out.println("contoh break");
           for (int i = 1; i <= 10; i++) {
            if (i == 5){
            break;
            }
            System.out.println(i);
           }
        System.out.println("contoh return");
           for (int i = 1; i <= 10; i++) {
            if (i == 5){
            return;
            }
            System.out.println(i);
           }
    }
}

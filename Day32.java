public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai :");
        int nilai = sc.nextInt();
        System.out.println("masukkan umur :");
        int umur = sc.nextInt();

        int tambahnilai = nilai + 5;
        int tambahumur = umur++;


        boolean lulus = nilai >=60;
        boolean dewasa = umur >= 17;
        boolean status = lulus && dewasa;

        System.out.println("nilai di + 5    : " + tambahnilai);
        System.out.println("umur tahun depan    : " + (umur));
        System.out.println("lulus   : " + lulus);
        System.out.println("dewasa  : " + dewasa);
        System.out.println("lulus dan dewas : " + status);
        
    }
}

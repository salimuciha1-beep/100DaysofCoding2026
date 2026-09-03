public class Day2 {
    public static void main(String[] args) {
        String nama = "muhammad mursalim";
        String tempatlahir = "lembang bunga";
        int umur = 19;
        double tinggibadan = 170.5;


        // 1. println() - menampilkan teks dan otomatis pidah baris baru.
        System.out.println("=== biodata diri ===");
        System.out.println("nama     :" + nama);


        // 2. print() - menampilkan teks tampa pinda baris.
        System.out.print("tempat lahir :");
        System.out.print(tempatlahir);
        System.out.print("\n");// menggunakan \n untuk pindah baris secara manual


        // 3. printf() - menampilkan teks dengan format variabel
        // %d = integer (angka bulat), %.1f = float/dooble (1 angka di belakang koma)
        
        System.out.printf("umur     : %d tahun %n", umur  );
        System.out.printf("tinggi badan  : %.1f cm%n ", tinggibadan);

    }
    
}

public class Day20 {
    public static void main(String[] args) {
        int umur = 20;
        double tinggi = 170.5;
        boolean mahasiswa = true;
        char kelas = 'C';

        String sUmur = String.valueOf(umur);
        String sTinggi = String.valueOf(tinggi);
        String sMahasiswa = String.valueOf(mahasiswa);
        String sKelas = String.valueOf(kelas);

        String kalimat = "umur " + sUmur + ", tinggi " + sTinggi + ", mahasiswa " + sMahasiswa + ", kelas " + sKelas;
        System.out.println(kalimat);

    }
}

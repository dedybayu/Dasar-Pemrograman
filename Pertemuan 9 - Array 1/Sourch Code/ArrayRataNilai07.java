import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int jumlahMhs;
        System.out.print("Masukan Jumlah Mahasiswa : ");
        jumlahMhs = input07.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input07.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-Rata Nilai             : " + rata2);

        // Modifikasi berapa yg Lulus dan Tdk Lulus
        int lulus = 0, tdkLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += 1;
            } else {
                tdkLulus += 1;
            }
        }
        System.out.println("Banyak yang Lulus           : " + lulus);
        System.out.println("Banyak yang Tidak Lulus     : " + tdkLulus);

        // Modifikasi rata-rata lulus dan td lulus
        int totaLulus = 0, totalTdkLulus = 0, rata2Lulus, rata2TdkLulus;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totaLulus += nilaiMhs[i];
            } else {
                totalTdkLulus += nilaiMhs[i];
            }
        }
        rata2Lulus = totaLulus / lulus;
        rata2TdkLulus = totalTdkLulus / tdkLulus;

        System.out.println("Rata-rata nilai Lulus       : " + rata2Lulus);
        System.out.println("Rata-rata nilai Tidak Lulus : " + rata2TdkLulus);
    }
}

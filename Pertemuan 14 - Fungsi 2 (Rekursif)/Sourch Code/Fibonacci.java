import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulan;
        while (true) {
            System.out.print("Masukan Bulan : ");
            bulan = sc.nextInt();

            if (bulan <= 0) {
                System.out.println("Bulan Tidak Valid!!");

            } else {
                break;
            }
        }

        // int jumlahPasangan = hitungPasanganMarmut(bulan);
        // int pasanganBelumProduktif = hitungPasanganMarmut(bulan - 1);
        // int pasanganProduktif = jumlahPasangan - pasanganBelumProduktif;

        System.out.println("Jumlah pasangan produktif marmut adalah        : "
                + (hitungPasanganMarmut(bulan) - hitungPasanganMarmut(bulan - 1)));
        System.out.println("Jumlah pasangan belum produktif marmut  adalah : " + hitungPasanganMarmut(bulan - 1));
        System.out.println("Jumlah total pasangan marmut                   : " + hitungPasanganMarmut(bulan));
    }

    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }
}

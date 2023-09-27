import java.util.Scanner;
public class Gaji07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        System.out.print("Masukan Besaran Gaji Perhari              : ");
        gaji = input.nextInt();
        System.out.print("Masukan Besaran Potong Gaji Perhari       : ");
        potGaji = input.nextInt();
        System.out.print("\nMasukan Jumlah Hari Masuk Kerja Anda      : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukan Jumlah Hari Tidak Masuk Kerja Anda: ");
        jmlTdkMasuk = input.nextInt();

        totGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.print("Gaji Yang Anda Terima Adalah              : " + totGaji);
    }
}

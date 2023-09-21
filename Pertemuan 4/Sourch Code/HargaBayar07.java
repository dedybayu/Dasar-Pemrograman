import java.util.Scanner;
public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String merkBuku;
        int harga, jumlah, jmlHlmnBuku;
        double dis, total, bayar, jmlDis;

        System.out.print("Masukan merk buku                 : ");
        merkBuku = input.nextLine();
        System.out.print("Masukan jumlah halaman buku       : ");
        jmlHlmnBuku = input.nextInt();
        System.out.print("Masukan harga buku yang dibeli    : ");
        harga = input.nextInt();
        System.out.print("Masukan jumlah buku yang dibeli   : ");
        jumlah = input.nextInt();
        System.out.print("Masukan jumlah diskon             : ");
        dis = input.nextDouble();

        total = harga * jumlah;
        jmlDis = total * dis;
        bayar = total-jmlDis;

        System.out.println(String.format("\nAnda memilih buku %s yang memiliki %d halaman", merkBuku, jmlHlmnBuku));
        System.out.println("Diskon yang anda peroleh  : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar : "+ bayar);

    }
}
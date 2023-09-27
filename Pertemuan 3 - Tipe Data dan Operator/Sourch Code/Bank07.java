import java.util.Scanner;
public class Bank07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akir;

        System.out.print("Masukan Jumblah Tabungan Awal : ");
        jml_tabungan_awal = input.nextInt();
        System.out.print("Masukan Lama Menabung         : ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;
        jml_tabungan_akir = bunga + jml_tabungan_awal;
        System.out.println("Bunga                         : " + bunga);
        System.out.println("Jumblah Tabungan Akhir        : " + jml_tabungan_akir);
    }
}

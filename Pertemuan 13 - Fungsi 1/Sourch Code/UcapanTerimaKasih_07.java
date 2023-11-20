import java.util.Scanner;
public class UcapanTerimaKasih_07 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliaskan Nama yang ingin diberi Ucapan: ");
        String namaOrang  = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("\nThank You "+nama+", kamu yang terbaik");
    }
    
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}

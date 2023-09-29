import java.util.Scanner;
public class PemilihanPercobaan207 {
    public static void main(String[] args) {
      Scanner input07 = new Scanner(System.in);
      
      System.out.print("Nilai UAS    : ");
      float uas = input07.nextFloat();
      System.out.print("Nilai UTS    : ");
      float uts = input07.nextFloat();
      System.out.print("Nilai Kuis   : ");
      float kuis = input07.nextFloat();
      System.out.print("Nilai Tugas  : ");
      float tugas = input07.nextFloat();

      float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

      String message = (total > 80 && total <= 100) ? "Sangat Baik" : (total > 73 && total <= 80) ? "Lebih dari Baik" :
      (total > 65 && total <= 73) ? "Baik" : (total > 60 && total <= 65) ? "Lebih dari Cukup" : (total > 50 && total <= 60) ? "Cukup" : 
      (total > 39 && total <= 50) ? "Kurang" : "Gagal" ;
      
      System.out.println("Nilai akhir = " + total + " sehingga nilai anda " + message);

    }
}

import java.util.Scanner;
public class Tugas {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Elemen : ");
        int jumlahElemen = input07.nextInt();

        int[] elemen = new int[jumlahElemen];
        
        System.out.println("==========================");

        for (int i=0; i < jumlahElemen; i++){
            System.out.print("Masukan Elemen ke-"+(i+1)+" : ");
            elemen[i] = input07.nextInt();
        }

        int nilaiTertinggi = elemen[0];
        int nilaiTerendah = elemen[0];
        int total = elemen[0];

        for (int i=1; i < jumlahElemen; i++){
            if (elemen[i] > nilaiTertinggi) {
                nilaiTertinggi = elemen[i];
            }
            if (elemen[i] < nilaiTerendah){
                nilaiTerendah = elemen[i];
            }
            total += elemen[i];
        }

        double rataRata = (double) total / jumlahElemen;

        System.out.println("==========================");
        System.out.println("Nilai Tertinggi   : "+nilaiTertinggi);
        System.out.println("Nilai Terendah    : "+nilaiTerendah);
        System.out.println("Nilai rata - rata : "+rataRata);
    }
}

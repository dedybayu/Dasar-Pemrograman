import java.util.Scanner;
public class WhileGaji07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;

        System.out.print("Masukan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();
        
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manager, Karyawan");
            scan.nextLine(); //BUG Kenapa ini
            
            System.out.print("Masukan Jabatan Karyawan ke-" + (i + 1) + ": ");
            jabatan = scan.nextLine();
            System.out.print("Masukan Jumlah Jam Lembur  : ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manager")){
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total Gaji Lembur : " + totalGajiLembur);
    }
}

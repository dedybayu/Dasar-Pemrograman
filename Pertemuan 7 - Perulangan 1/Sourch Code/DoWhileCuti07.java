import java.util.Scanner;
public class DoWhileCuti07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jatahCuti,  jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            sc.nextLine();
            System.out.print("Apakah Anda Ingin Mengambil Cuti (y/t)? ");
            konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.print("Jumlah Hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            } 
            else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("Program Berhenti");
                System.exit(0);
            }
            
        } while (jatahCuti > 0);

    }
}

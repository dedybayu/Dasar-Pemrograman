import java.util.Scanner;

public class TugasArray2D {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        String elemen[][] = new String[5][5];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.print("Masukan Nama  : ");
            nama = input07.nextLine();

            while (true) {
                System.out.print("Masukan Baris : ");
                baris = input07.nextInt();
                System.out.print("Masukan Kolom : ");
                kolom = input07.nextInt();
                input07.nextLine();

                if ((baris >= 0 && baris < elemen.length)
                        && (kolom >= 0 && kolom < elemen[0].length)) {

                    if (elemen[baris][kolom] == null) {
                        elemen[baris][kolom] = nama;
                        break;
                    } else {
                        System.out.println("Elemen sudah terisi nama lain");
                        System.out.printf("Masukan Lagi untuk (%s)\n", nama);
                    }

                } else {
                    System.out.println("Baris atau Kolom Tidak tersedia!");
                    System.out.printf("Masukan Lagi untuk (%s)\n", nama);
                }
            }
            System.out.print("Input nama lainnya? (y/n) : ");
            next = input07.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nDaftar elemen:");
        for (int i = 0; i < elemen.length; i++) {
            for (int j = 0; j < elemen[i].length; j++) {
                if (elemen[i][j] == null) {
                    elemen[i][j] = "***";
                }
            }
            System.out.println("nama pada baris ke-" + (i) + ": " + String.join(", ", elemen[i]));
        }
    }
}

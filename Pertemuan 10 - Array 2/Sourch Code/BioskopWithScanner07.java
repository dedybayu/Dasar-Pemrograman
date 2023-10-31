import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String next, nama;
        int baris, kolom, pilihan;

        while (true) {
            System.out.println("\n================================");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("================================");
            System.out.print("Masukan Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukan nama   : ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukan baris  : ");
                            baris = sc.nextInt();
                            System.out.print("Masukan kolom  : ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if ((baris >= 1 && baris <= penonton.length)
                                    && (kolom >= 1 && kolom <= penonton[0].length)) {

                                    if (penonton[baris-1][kolom-1]== null){
                                        penonton[baris - 1][kolom - 1] = nama;
                                        break;
                                    } else {
                                        System.out.println("Kursi sudah terisi penonton lain");
                                        System.out.printf("Masukan Lagi untuk (%s)\n", nama);
                                    }

                            } else {
                                System.out.println("Baris atau Kolom Tidak tersedia!");
                                System.out.printf("Masukan Lagi untuk (%s)\n", nama);
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n) : ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {

                        for(int j=0; j < penonton[i].length; j++){
                            if(penonton[i][j] == null){
                                penonton[i][j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }

    }
}

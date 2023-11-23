import java.util.Scanner;

public class NilaiMahasiswa {
    static String[] namaMahasiswa = { "Sari", "Rina", "Yani", "Dwi", "Lusi" };
    static int[][] nilaiMahasiswa = new int[namaMahasiswa.length][2];

    public static void main(String[] args) {
        inputDataNilai();
        tampilkanNilaiMahasiswa();
        HariNilaiTertinggi();
        mahasiswaNilaiTertinggi();
    }

    // Fungsi input data nilai mahasiswa
    public static void inputDataNilai() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Masukkan nilai untuk mahasiswa " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");
        System.out.print("| Nama |");
        for (int i = 0; i < nilaiMahasiswa[0].length; i++){
            System.out.print(" Minggu-"+(i+1)+" |");
        }
        System.out.println();
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari keberapa terdapat nilai tertinggi
    public static void HariNilaiTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    hariTertinggi = j + 1;
                }
            }
        }

        System.out
                .println("Nilai tertinggi adalah pada Minggu ke-" + hariTertinggi + ", dengan nilai " + nilaiTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi beserta
    // keterangan nilai dari minggu ke-
    public static void mahasiswaNilaiTertinggi() {
        int hariTertinggi = 0, nilaiTertinggi = 0;
        String namaMhs = null;

        for (int i = 0; i < namaMahasiswa.length; i++) {
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    hariTertinggi = j + 1;
                    namaMhs = namaMahasiswa[i];
                }
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMhs + ", \ndengan nilai " + nilaiTertinggi
                + ", pada minggu ke-" + hariTertinggi);
    }
}

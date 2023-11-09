import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int N;
        do {
            System.out.print("Masukkan nilai N (minimal 5): ");
            N = input07.nextInt();

            if (N < 5) {
                System.out.println("Nilai N minimal harus 5 atau lebih.");
                // return;
            }
        } while (N < 5);

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                // Cetak angka dari 1 sampai N jika i ganjil
                for (int j = 1; j <= N; j++) {
                    System.out.print(j);
                }
            } else {
                // Cetak angka dari N sampai 1 jika i genap
                for (int j = N; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak baris ke-i
        }
    }
}

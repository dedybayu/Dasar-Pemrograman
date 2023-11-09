import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int N;
        do {
            System.out.print("Masukkan nilai N (minimal 3): ");
            N = input07.nextInt();

            if (N < 3) {
                System.out.println("Nilai N minimal harus 3 atau lebih.");
            }
        } while (N < 3);

        if (N < 10) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  "); // Spasi tengah
                    }
                }
                System.out.println();
            }
        } else if (N >= 10){  // Jika >= 10 agar tidak berantakan
            
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("   "); // Spasi untuk bagian tengah
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
        }

    }
}

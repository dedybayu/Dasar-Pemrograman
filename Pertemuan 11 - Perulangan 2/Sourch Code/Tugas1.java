import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();
        int i = 0;

        while (i <= n) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            int j = 0;
            while (j < i) {
                System.out.print(j + 1);
                j++;
            }
            i++;
            System.out.println(); 
        }
    }
}
import java.util.Scanner;

public class TugasTeoriB {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
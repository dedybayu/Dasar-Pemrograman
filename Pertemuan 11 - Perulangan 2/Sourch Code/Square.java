import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

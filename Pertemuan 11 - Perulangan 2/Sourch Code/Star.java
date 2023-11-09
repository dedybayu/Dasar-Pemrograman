import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();

        for (int i = 0; i < n; i--) {
            System.out.print("*");
        }

    }
}

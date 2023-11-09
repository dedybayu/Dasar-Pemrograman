import java.util.Scanner;

public class TugasTeoriA {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " bukan bilangan prima");
        } else {
            if (cekPrimaRekursif(n, n - 1)) {
                System.out.println(n + " adalah bilangan prima");
            } else {
                System.out.println(n + " bukan bilangan prima");
            }
        }
    }

    static boolean cekPrimaRekursif(int n, int x) {
        if (x == 1) {
            return true;
        } else {
            if (n % x == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, x - 1);
            }
        }
    }
}

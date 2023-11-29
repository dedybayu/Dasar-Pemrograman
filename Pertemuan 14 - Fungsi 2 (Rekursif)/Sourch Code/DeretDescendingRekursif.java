import java.util.Scanner;
public class DeretDescendingRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Bilangan n : ");
        int n = sc.nextInt();
        System.out.println("Deret descending menggunakan rekursif:");
        deretDescendingRekursif(n);
        System.out.println("\nDeret descending menggunakan rekursif:");
        deretDescendingIteratif(n);
    }

    public static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}

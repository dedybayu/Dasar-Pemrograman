import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        System.out.print( " = "+penjumlahanRekursif(n));
    }


    static int penjumlahanRekursif(int n) {
        if (n <= 0){
            System.out.print(n);
            return (n);
        } else if (n == 1) {
            System.out.print(n);
            return n;
        } else {
            int result = penjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
            return result + n;
        }
    }
}

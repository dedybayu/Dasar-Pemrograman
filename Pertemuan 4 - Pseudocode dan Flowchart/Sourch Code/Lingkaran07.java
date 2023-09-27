import java.util.Scanner;
public class Lingkaran07 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int r;
    double keliling, luas, phi = 3.14;

    System.out.print("Masukan Jari-Jari Lingkaran : ");
    r = input.nextInt();

    keliling = 2 * phi * r;
    luas = phi * r * r;

    System.out.println("\nKeliling  : " + keliling);
    System.out.println("Luas      : " + luas);
   } 
}
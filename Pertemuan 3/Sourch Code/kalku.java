import java.util.Scanner;
public class kalku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
         int panjang, lebar;
         float luas;
         System.out.print("Masukan Nilai A: ");
         panjang = input.nextInt();
         System.out.print("Masukan Nilai B: ");
         lebar = input.nextInt();
         luas = panjang % lebar;
         System.out.println("Luas: " + luas);
    }
}

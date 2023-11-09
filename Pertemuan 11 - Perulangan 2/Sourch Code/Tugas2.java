import java.util.Scanner;

public class Tugas2 {
   public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();
        int i = 0;

        while (i < n) {
            int j = n;
            while (j > i) {
                System.out.print("*");
                j--;     
            }
            i++;
            System.out.println(); //Ditambah Ini
        }
   } 
}

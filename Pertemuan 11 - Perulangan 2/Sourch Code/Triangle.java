import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = input07.nextInt();
        int i = 0;

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
               
            }
            i++;
            
        }
    }
}

import java.util.Scanner;
public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int bil1, bil2, bil3, bilanganTerbesar=0;
        System.out.print("Masukan Bilangan 1 : ");
        bil1 = input07.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = input07.nextInt();
        System.out.print("Masukan Bilangan 3 : ");
        bil3 = input07.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3){
                bilanganTerbesar = bil1;
            }
        } else if (bil2 >= bil1) {
            if (bil2 >= bil3) {
                bilanganTerbesar = bil2;
            } else {
                bilanganTerbesar = bil3;
            } 
        }

        System.out.println("Bilangan Terbesar  : " + bilanganTerbesar);
    }
}

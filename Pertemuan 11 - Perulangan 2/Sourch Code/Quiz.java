import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random07 = new Random();
        Scanner input07 = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random07.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak Angka (1 - 10) : ");
                int answer = input07.nextInt();
                input07.nextLine();
                success = (answer == number);

                if (answer < number) {
                System.out.println("Tebakan Lebih Kecil");
                } else if (answer > number) {
                System.out.println("Tebakan Lebih Besar");
                } else {
                System.out.println("Selamat Anda Berhasil");
                success = true;
                }

            } while (!success);

            System.out.print("Apakah anda ingin mengulang permainan (y/Y)? : ");
            menu = input07.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

    }
}

                // Apakah Lanjut Menebak
                // System.out.print("Lanjut menebak?      : ");
                // char lanjut = input07.nextLine().charAt(0);
                // if (lanjut == 'n' || lanjut == 'N') {
                //     break;
                // }
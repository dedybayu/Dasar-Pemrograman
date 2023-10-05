import java.util.Scanner;
public class GameFps {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        
        int jarak;
        System.out.print("Masukan Jarak Menembak: ");
        jarak = input07.nextInt();

        if (jarak <= 5){
            System.out.println("Silahkan Gunakan Male Weapon");
        } else if ((jarak > 5) || (jarak > 1000)){
            System.out.println("Silahkan Menggunakan Range Weapon");
        }

    }
}

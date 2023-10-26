import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukan Jumlah Elemen : ");
        int jmlElemen = input07.nextInt();

        int[] arrayInt = new int[jmlElemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukan elemen ke-" + i + " : ");
            arrayInt[i] = input07.nextInt();
        }

        System.out.print("Masukan key yang dicari : ");
        int key = input07.nextInt();

        int hasil = 0; 
        boolean keyDitemukan = false;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                keyDitemukan = true;
                break;
            }
        }

        if (keyDitemukan == true) {
            System.out.println("Key ada pada posisi ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}

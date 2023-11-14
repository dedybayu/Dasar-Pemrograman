import java.util.Scanner;

public class Porseni2024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat array untuk menyimpan nama atlet dari berbagai cabang
        String[][] atlet1 = new String[4][3];

        for (int i = 0; i < atlet1.length; i++) {
            if (i == 0) {
                System.out.println("Masukan nama Atlet Badminton");
            } else if (i == 1) {
                System.out.println("Masukan nama Atlet Tenis Meja");
            } else if (i == 2) {
                System.out.println("Masukan nama Atlet Basket");
            } else if (i == 3) {
                System.out.println("Masukan nama Atlet Voly");
            }

            for (int j = 0; j < atlet1[0].length; j++) {
                System.out.print("Masukan Atlet ke-" + (j + 1) + " : ");
                atlet1[i][j] = input.nextLine();
            }
        }

        // Pengurutan nama atlet
        for (int i = 0; i < atlet1.length; i++) {
            for (int j = 0; j < atlet1[i].length - 1; j++) {
                for (int k = 0; k < atlet1[i].length - j - 1; k++) {
                    if (atlet1[i][k].compareTo(atlet1[i][k + 1]) > 0) {
                        String temp = atlet1[i][k];
                        atlet1[i][k] = atlet1[i][k + 1];
                        atlet1[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Daftar Atlet:");

        // Cetak nama atlet yang sudah diurutkan
        for (int i = 0; i < atlet1.length; i++) {
            if (i == 0) {
                System.out.println("Badminton:");
            } else if (i == 1) {
                System.out.println("Tenis Meja:");
            } else if (i == 2) {
                System.out.println("Basket:");
            } else if (i == 3) {
                System.out.println("Voly:");
            }

            for (int j = 0; j < atlet1[i].length; j++) {
                System.out.println(""+atlet1[i][j]);
            }
        }
    }
}

import java.util.Scanner;
public class Kubus07 {
    static int hitungLuas (int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    static int hitungVolume (int sisi){
        int volume = hitungLuas(sisi) * sisi;
        return volume;
    }
    static int hitungLuasPermukaan (int sisi){
        int luasPermukaan = hitungLuas(sisi) * 6;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LP, vol;
        System.out.print("Panjang Sisi Kubus   : ");
        int sisi = input.nextInt();

        LP = hitungLuasPermukaan(sisi);
        vol = hitungVolume(sisi);

        System.out.println("Luas Permukaan Kubus : "+ LP);
        System.out.println("Volume Kubus         : "+ vol);
    }
}

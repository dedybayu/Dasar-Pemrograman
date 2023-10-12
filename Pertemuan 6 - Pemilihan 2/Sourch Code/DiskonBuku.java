import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String jenisBuku;
        int jumblahBuku;
        int diskon = 0;

        System.out.print("Masukan Jenis Buku : ");
        jenisBuku = input07.nextLine();
        System.out.print("Masukan Jumblah    : ");
        jumblahBuku = input07.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")){
            diskon = 10;
            if (jumblahBuku > 2){
                diskon = diskon + 2;
            } 
        } else if (jenisBuku.equalsIgnoreCase("novel")){
            diskon = 7;
            if (jumblahBuku > 3){
                diskon = diskon + 2;
            } else {
                diskon = diskon + 1;
            }
        } else{
            if (jumblahBuku > 3){
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        System.out.println("Total Diskon       : " + diskon + "%" );
    }
}

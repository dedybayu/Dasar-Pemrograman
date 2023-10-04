import java.util.Scanner;
public class Pemilihan2Percobaan107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int tahun;
        System.out.print("Masukan Tahun : ");
        tahun = input07.nextInt();

        //if ((tahun % 4 == 0) && ((tahun % 100 != 0) || (tahun % 400 == 0))){
                //System.out.println("Tahun Kabisat");
        //} 
        if (tahun % 400 == 0){
            if (tahun % 100 == 0){
            System.out.println("Tahun Kabisat");
            }
            else if (tahun % 4 == 0){
                if (tahun % 100 != 0)
                System.out.println("Tahun Kabisat");
            }
            
        }
        else
        System.out.println("Bukan Tahun Kabisat");
    }
}
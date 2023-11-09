import java.util.Scanner;
public class NestedLoop_2341720041 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double[] total = new double[5];
        double[] rataRata = new double[5];

        for(int i=0; i < temps.length; i++) {
            System.out.println("Kota ke-"+(i+1));
            for (int j = 0; j < temps[0].length; j++){
                System.out.print("Hari ke-"+(j+1)+" : ");
                temps[i][j] = input07.nextDouble();
            }
            System.out.println();
        }

        for(int i=0; i < temps.length; i++) {
            System.out.println("Kota ke-"+(i+1));
            int j = 0;
            for (double temp : temps[i]) {
                System.out.println("Suhu Hari ke-"+(j+1)+ " Adalah : " + temp + "°C");  
                total[i] += temps[i][j];
                j++;
            }
            rataRata[i] = total[i] / temps[0].length;
            System.out.println("Rata-Rata suhu kota ke-"+(i+1)+" adalah : "+(float)rataRata[i]+"°C");
            System.out.println(); 
        }

    }    
}
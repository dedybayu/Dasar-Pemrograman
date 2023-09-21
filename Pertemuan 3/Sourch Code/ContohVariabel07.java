public class ContohVariabel07 {
    public static void main(String[] args){
        String hobi = "Bermain Drum"; //untuk kata//
        boolean apaPandai = true; //true false//
        char jenis_kelamin = 'L';     //Karakter syarat  petik 1//
        byte umur_brapa = 18;
        double $ipk = 3.95, tinggi = 1.79;
        System.out.println(hobi);
        System.out.println("Apakah Pandai?   " + apaPandai);
        System.out.println("Jenis Kelamin  : " + jenis_kelamin);
        System.out.println("Umurku saat ini: " + umur_brapa);
        System.out.println(String.format("Saya beripk %f, dengan tinggi badan %s", $ipk, tinggi));
    }
}
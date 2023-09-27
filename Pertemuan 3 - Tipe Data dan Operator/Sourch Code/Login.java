import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String username= input.nextLine();
        System.out.print("Masukan Password: ");
        String password= input.nextLine();
        System.out.println("Usernamemu: " + username);
        System.out.println("Passwordmu: " + password);
        if (username.equals("alek")){
            if (password.equals("Rs123")){
            }
            else{
                System.out.println("anda gagal :(");
            }
        System.out.println("Selamat Anda berhasil.");    
        }
        else{
            System.out.println("Selamat anda gagal");
        }
    }
}
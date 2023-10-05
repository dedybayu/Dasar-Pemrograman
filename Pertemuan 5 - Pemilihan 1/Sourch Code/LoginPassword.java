import java.util.Scanner;
public class LoginPassword {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String username, password;

        System.out.print("Masukan Username: ");
        username = input07.nextLine();
        System.out.print("Masukan Password: ");
        password = input07.nextLine();

        if (username.equals("admin")  && password.equals("user")) {
            System.out.println("Anda Berhasil Login");
        } else
        System.out.println("Username atau Password Salah");
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password, wrong_password;
        int choice;

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if (username.equals("Bilge") && password.equals("sherlocked")) {
            System.out.print("Başarıyla giriş yaptınız!");
        } else {
            System.out.print("Kullanıcı adınız veya şifreniz hatalı. ");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? \n 1-Evet \n 2-Hayır");
        }
        choice = inp.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Yeni şifrenizi giriniz: ");
                wrong_password = inp.nextLine();

                if (password.equals(wrong_password)) {
                    System.out.print("Yeni şifreniz eskisiyle aynı olamaz. ");

                }else{
                    System.out.print("Şifreniz başarıyla oluşturuldu. ");
                    break;
                }

            case 2:
                System.out.print("Şifreniz başarıyla oluşturuldu! ");
            default:
                System.out.println("Şifrenizi tekrar giriniz.");
                break;

        }
    }

}
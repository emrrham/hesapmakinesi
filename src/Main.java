   import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
      String userName,password;

      Scanner inp = new Scanner(System.in);
      System.out.print("Gulag Kullanıcı adı giriniz : ");
      userName = inp.nextLine();

      System.out.print("Gulag Şifresi Giriniz : ");
      password = inp.nextLine();
      if(userName.equals("emrrham") && password.equals("akif") ){
          System.out.println("Bilgileriniz doğru! добро пожаловать солдат!!! ");

      }
else {
    System.out.println("Bilgileriniz Yanlış  kürek mahkûmları kampına aktarılıyorsunuz...");
      }

            }


    }


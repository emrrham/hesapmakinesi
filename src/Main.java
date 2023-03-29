   import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
     int n1,n2,select;
     Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayı ?");
     n1 = input.nextInt();

        System.out.println("ikinci sayı ?");
     n2 = input.nextInt();
     System.out.println("1-Toplama\n2-çıkarma\n3-çarpma\n4-bölme\n5-atak");
     System.out.print("Seçimin?");
     select = input.nextInt();
     System.out.println(select);
        switch (select) {
            case 1 :
                System.out.println("Toplam : " +  (n1 + n2) );

                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));

                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölüm : " + (n1/n2));
               break;
            case 5:
                System.out.println("ATAK BAŞARAMADIN");
                break;
            default:
                System.out.println("YANLIŞ GİRDİN YA ZATEN 5 TANE VAR AMK ");
                break;


    }
    }
    }

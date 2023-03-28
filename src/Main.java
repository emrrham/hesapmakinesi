import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişken oluştur
        int mat,fizik,kimya,biyoloji,beden;
        //Scanner tanımla
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan değer alma
        System.out.print("Matematik notu :");
        mat = inp.nextInt();

        System.out.print("beden notu :");
        fizik = inp.nextInt();

        System.out.print("biyoloji notu :");
        kimya  = inp.nextInt();

        System.out.print("kimya notu :");
        biyoloji = inp.nextInt();

        System.out.print("fizik notu :");
        beden = inp.nextInt();

        int toplam = (mat + fizik + kimya + biyoloji + beden);
        double sonuc = toplam/6;

        System.out.println("akifin götten yeme ortalaması" + sonuc);

        boolean condition =  sonuc > 31;

        String result = condition ? "AKİF GEÇTİN AMA GÖTTEN YEDİN!" : "AKİF GEÇEMEDİN AMA GÖTTEN YEDİN";

        System.out.println(result);



    }
}

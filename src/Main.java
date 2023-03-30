   import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
      int mat,fizik,kimya,biyoloji;
       Scanner input = new Scanner(System.in);
               System.out.println("Matematik notunuz : ");
      mat = input.nextInt();
               System.out.println("Fizik notunuz : ");
      fizik = input.nextInt();
               System.out.println("Kimya notunuz : ");
      kimya = input.nextInt();
               System.out.println("biyoloji notunuz : ");
      biyoloji = input.nextInt();

            double avarage = (mat + fizik + kimya + biyoloji)/ 4 ;
            if (avarage<= 45){
                System.out.println("Geçemediniz!");
                System.out.println("Ortalamanız : " + avarage);

        }else{
                System.out.println("Tebrikler geçtin!");
            System.out.println("Ortalamanız : " + avarage);
        }

            }


    }


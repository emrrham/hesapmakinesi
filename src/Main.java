   import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner input = new Scanner(System.in);
                System.out.println("Sıcaklık giriniz : (°C cinsinden)");
                sıcaklık = input.nextInt();
        if (sıcaklık < 5){
            System.out.println("PC oynamaya devam..");
            
        } else if (sıcaklık >= 5 && sıcaklık<= 25 ) {
            if (sıcaklık<=15){System.out.println("Bahçeye git");
            
        }if (sıcaklık >= 10){
                System.out.println("Pikniğe git.");
            } else if (sıcaklık>25) {
                System.out.println("Yüzmeye git!");
            }else
                System.out.println("akifi görmeye gidebilirsin.");
                
            }


        }


    }


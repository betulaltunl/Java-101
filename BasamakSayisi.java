//Bir sayının basamak sayılarının toplamını hesaplayan program
import java.util.Scanner;

public class BasamakSayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        input.close();

        int result=0, basamakSayisi=0,i;

        for( ;number != 0;number/=10){
            i=number%10;
            result+=i;
            basamakSayisi++;
        }
        System.out.print("Girilen sayinin basamak sayisi: "+basamakSayisi);
        System.out.print("\nGirilen sayinin basamak sayilarinin toplami: "+result);   
            
    }
}
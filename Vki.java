import java.util.Scanner;
import java.util.*;
//Vücut Kitle İndeksi Hesaplama

public class Vki{
    public static void main(String[]args){
        double index;

        Scanner inp = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz : ");
        double kilo = inp.nextDouble();
        inp.close();

        index = kilo/(boy*boy);
        System.out.print("Vücut Kitle İndeksiniz :"+index);


        }
}
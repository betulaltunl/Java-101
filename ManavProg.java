import java.util.Scanner;

public class ManavProg{

    public static void main(String[] args){

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00; 

        System.out.print("Armut Kaç Kilo ? :");
        Scanner enter=new Scanner(System.in);
        int kiloArmut= enter.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        int kiloElma= enter.nextInt();
        
        System.out.print("Domates Kaç Kilo ? :");
        int kiloDomates= enter.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        int kiloMuz= enter.nextInt();

        System.out.print("Patlican Kaç Kilo ? :");
        int kiloPatlican= enter.nextInt();
        enter.close();

        double toplam=(armut*kiloArmut)+(elma*kiloElma)+(domates*kiloDomates)+(muz*kiloMuz)+(patlican*kiloPatlican);
        System.out.print("Toplam Tutar : "+toplam+"TL");

    }

}
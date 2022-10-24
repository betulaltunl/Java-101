import java.util.Scanner;


public class HesapMakinesi{
    public static void main(String[] args){
        

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int deger1=input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int deger2=input.nextInt();
        

        
        
        System.out.println("Islem türünü seciniz:\nToplama->1\nCikarma->2\nCarpma->3\nBolme->4");
        int islemSec=input.nextInt();
        input.close();

        switch(islemSec){
            case 1:
                int toplam=deger1+deger2;
                System.out.print("Sonuc: "+toplam);
                break;
            case 2:
                int cikarma=deger1-deger2;
                System.out.print("Sonuc: "+cikarma);
                break;
            case 3:
                int carpma=deger1*deger2;
                System.out.print("Sonuc: "+carpma);
                break;
            case 4:
                int bolme=deger1/deger2;
                System.out.print("Sonuc: "+bolme);
                break;
            default:
            System.out.print("Yanlis secim yaptiniz!");
        }

    }
}
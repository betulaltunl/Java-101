import java.util.Scanner;

public class UcakBileti{
    public static void main(String[] args){
        int mesafe,yas,yon;
        double yasIndirimOrani,yonIndirimi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km turunden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yasinizi giriniz: ");
        yas = inp.nextInt();
        if(yas>=0 && yas<12){
            yasIndirimOrani = 0.5;
        }
        else if(yas>=12 && yas<=24){
            yasIndirimOrani = 0.1; 
        }
        else if(yas>65){
            yasIndirimOrani= 0.3;
        }else{
            yasIndirimOrani=1;
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidiş Donuş ): ");
        yon = inp.nextInt();
        inp.close();
        
        if(mesafe<=0 || yas<=0){
            System.out.print("Hatalı Veri Girdiniz !");
        }else{
           double normalTutar = mesafe * 0.10;
           /*
           Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
           Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
           Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır. */
           double yasIndirimi = normalTutar * yasIndirimOrani ;
           double indirimliTutar = normalTutar - yasIndirimi;
           if(yon==1){
              System.out.print("Toplam Tutar: "+indirimliTutar);
           }else if(yon==2){
              yonIndirimi = indirimliTutar * 0.2;
              indirimliTutar =2*(indirimliTutar-yonIndirimi);
              System.out.print("Toplam Tutar: "+indirimliTutar);
           }else{
              System.out.print("Hatalı Veri Girdiniz !");
           }
           
        }
    }
}
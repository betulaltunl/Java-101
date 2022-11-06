import java.util.Scanner;

public class HarmonikSeri {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        input.close();

        float result=0,n=1,sonuc;
        System.out.print("Girilen sayinin harmonik serisi: ");
        for( ;n<=number;n++){
            sonuc=(1/n);
            result+=(1/n);
            System.out.print(sonuc+" - ");
        }
        System.out.print("\n**************************************");
        System.out.print("\nHarmonik serinin sonucu: "+result);
    }
}
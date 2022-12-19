import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] list ={15,1000,12,788,1,-1,-1000,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input= new Scanner(System.in);
        System.out.println("1000 ile -1000 arasinda bir sayi giriniz: ");
        int sayi=input.nextInt();

        int ksayi=0;
        int bsayi=0;

        for (int i:list){
            if(i<sayi){
                ksayi=i;
            }
            if(i>sayi){
                bsayi=i;
                break;
            }
        }

        System.out.println("Girilen sayi sayi : "+sayi);
        System.out.println("Girilen sayidan kucuk en yakin sayi : "+ksayi);
        System.out.println("Girilen sayidan buyuk en yakin sayi : "+bsayi);
    }
}
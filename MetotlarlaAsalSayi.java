import java.util.Scanner;

public class MetotlarlaAsalSayi{

    static void asalSayi(int sayi,int i){
           if(i==sayi){
                System.out.print(sayi+" sayısı ASALDIR !");
                return;
           } 
            if(sayi%i==0){
                System.out.print(sayi+" sayısı ASAL değildir !");
                return;
            }
            asalSayi(sayi, i+1);
          } 
         
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number=inp.nextInt();

        asalSayi(number,2);
    }
}
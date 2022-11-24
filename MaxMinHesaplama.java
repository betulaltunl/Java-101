import java.util.Scanner;

public class MaxMinHesaplama{
    public static void main(String[] args){
        int i=1,min=-99999999,max=99999999;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int N =inp.nextInt();

        while(i<=N){
            Scanner input = new Scanner(System.in);
            System.out.println(i+". Sayıyı giriniz: ");
            int number =input.nextInt();

            if(i==1){
                min = number;
                max = number;
            }
            if(number<=min){
                min = number;
            }else if(number>=max){
                max = number;
            }
            i++;
        }
        System.out.println("En buyuk sayi: "+max);
        System.out.println("En kucuk sayi: "+min);
    }
}
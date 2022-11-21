import java.util.Scanner;

public class MukemmelSayi{
    public static void main(String[] args){
        int add=0;

        Scanner in = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = in.nextInt();

        for(int i=1; i<n; i++){
            if(n%i==0){
                add += i;
            }
        }
        if(add==n){
            System.out.print(n+" Mükemmel sayıdır.");
        }else{
            System.out.print(n+" Mükemmel sayı değildir.");
        }
    }
}
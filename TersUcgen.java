import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

    
        System.out.print("\n");
        for(int a=0; a<n ;a++){
            for(int b=1; b<=a+1 ;b++){
              System.out.print(" ");
            }
            for(int c=1; c<=(2*n-(2*a+1)); c++){
              System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
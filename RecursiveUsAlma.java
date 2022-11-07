import java.util.Scanner;

public class RecursiveUsHesabi{
    public static double usAlma(int base, int exponent) {
        double result=1.0;
        if(exponent>0){
            result*=base;
            exponent--;
            return result*usAlma(base, exponent);
        }
        if(exponent<0){
            result/=base;
            exponent++;
            return result*usAlma(base, exponent);
        }else
            return 1;
    }
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.print("Taban degeri giriniz :");
         int base = input.nextInt();
         System.out.print("Us degeri giriniz :");
         int exponent = input.nextInt();
         
         System.out.print("Sonuc : "+usAlma(base, exponent));

    }
}
import java.util.Scanner;
public class SayininKuvveti{

    public static void main(String[] args){

        int sayi;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        sayi= input.nextInt();
        input.close();
        if (sayi<0){
            System.out.println("Hatalı Giris");
        }
        else{
            System.out.println("Girilen sayiya kadar olan 4'un kuvvetleri: ");
            for (int i=1; i<=sayi; i*=4){
                System.out.println(i);
            }
            System.out.println("Girilen sayiya kadar olan 5'in kuvvetleri: ");
            for (int k=1; k<=sayi; k*=5){
                System.out.println(k);
            }
            System.out.println("Girilen sayiya kadar olan 4'un ve 5'in ortak kuvvetleri: ");
            for (int j=1; j<=sayi; j*=20){
                System.out.println(j);
            }
                
        }
            
    }
}
        

            
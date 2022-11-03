import java.util.Scanner;

public class UsAlma{
    public static void main(String[] args){

        double sonuc=1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu alınacak sayiyi girin: ");
        int x = scan.nextInt();

        System.out.print("Us degerini girin: ");
        int k = scan.nextInt();
        scan.close();
        
        if(k<0){
            for(int i=-1; i>=k; i--){
                sonuc/=x;
            }
            System.out.print("Us alma isleminin sonucu: "+sonuc);

        }
        if(k==0){
            System.out.print("Us alma isleminin sonucu:1");
        }
        if(k>0){
            for(int i=1; i<=k; i++){
                sonuc*=x;
            }
            System.out.print("Us alma isleminin sonucu: "+sonuc);
         }
    }
}
import java.util.Scanner;

public class ArtikYil{
    public static void main(String[] args){

        Scanner inp=new Scanner(System.in);
        System.out.print("Yil Giriniz: ");
        int yil = inp.nextInt();
        inp.close();

        if(yil%4==0){
            if(yil%100==0){
                System.out.print(yil+" bir artık yıldır değildir !");
            }
            else if(yil%400==0){
                System.out.print(yil+" bir artık yıldır!");
            }else{
                System.out.print(yil+" bir artık yıldır!");
            }
        }
    }
}
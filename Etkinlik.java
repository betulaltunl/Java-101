import java.util.Scanner;

public class Etkinlik{
    public static void main(String[] args){

    /*
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    */

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sicakligini giriniz: ");
        int heat =input.nextInt();
        input.close();
        if(heat<5){
            System.out.print("Kayak yapabilirsiniz");
        }
        else if(heat>=5 && heat<10){
            System.out.print("Sinemaya gidebilirsiniz");
        }
        else if(heat>=10 && heat<15){
            System.out.print("Sinemaya yada piknige gidebilirsiniz");
            
        }
        else if(heat>=15 && heat<25){
            System.out.print("Piknige gidebilirsiniz");
        }else{
            System.out.print("Yuzmeye gidebilirsiniz");
        }
    }
}
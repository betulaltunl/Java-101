import java.util.Scanner;


public class TaksimetreHesaplama{
    public static void main(String[] args){

        int acilisTutari = 10;
        double toplamTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen km girin: ");
        int km = input.nextInt();
        input.close();
        toplamTutar = acilisTutari+km*2.20;

        if(toplamTutar>=20){
            System.out.println("Odenecek tutar: "+toplamTutar+" TL'dir.");
        }else{
            System.out.println("Odenecek tutar: 20  TL'dir.");
        }
        
    }
}
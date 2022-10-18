import java.util.Scanner;

public class Daire{
    public static void main(String[] args){

        double pi=3.14;
        int merkezAci = 360;

        Scanner inp= new Scanner(System.in);
        System.out.print("Yaricap olan 'r' degerini girin: ");
        int r = inp.nextInt();

        System.out.print("Merkez acisi olan 'x' icin değer giriniz(0<=x<=360): ");
        double x = inp.nextDouble();
        inp.close();

        double cevre = 2*pi*r;
        double alan = pi*r*r;
        double xAciliAlan = (pi*(r*r)*x)/merkezAci;

        System.out.print("Yaricap degeri "+r+" olan dairenin \nCevresi: "+cevre+"\nAlanı: "+alan+"\nMerkez acisi x olan alan degeri: "+xAciliAlan);
        
    }
}
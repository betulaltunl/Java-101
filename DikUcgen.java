import java.util.Scanner;

public class DikUcgen{
    public static void main(String[] args) {
        
        
        double hipotenusC, cevreU , alan;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik kenarlardan birincisini giriniz: ");
        int dikKenarA = input.nextInt();
        


        System.out.println("Dik kenarlardan ikincisini giriniz: ");
        int dikKenarB = input.nextInt();
        input.close();

        hipotenusC= Math.sqrt((dikKenarA*dikKenarA)+(dikKenarB*dikKenarB));
        System.out.println("Hipotenus: "+hipotenusC);

        cevreU = hipotenusC+dikKenarA+dikKenarB;
        alan = (dikKenarA*dikKenarB)/2;
        System.out.println("Degerleri girilen ucgenin cevresi: "+cevreU+", alanı: "+alan);
        
    }

}
import java.util.Scanner;

public class Kdv{
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz: ");
        tutar = inp.nextDouble();
        
            if(tutar>0 && tutar<=1000){
                kdvOran = 0.18;
                double kdvTutari = tutar * kdvOran;
                System.out.println("Girilen ucretin KDV tutari: "+kdvTutari);
            }
            else if(tutar>1000){
                kdvOran =0.08;
                double kdvTutari = tutar * kdvOran;
                System.out.println("Girilen ucretin KDV tutari: "+kdvTutari);
            }
        inp.close();
        
    
    }

}
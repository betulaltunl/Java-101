import java.util.Scanner;
public class NotOrtalamasi2 {
     public static void main(String[] args) {
        
        int mat,fizik,kimya,turkce,tarih;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
			mat = 0;
        }
        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
			fizik = 0;
        }
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
			kimya = 0;
        }
        
        System.out.println("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
			turkce = 0;
        }
        
        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        if (tarih < 0 || tarih > 100) {
			tarih = 0;
        }
        input.close();
        
        
        int total = (mat + fizik + kimya + turkce + tarih);
        double avarage = total/5.0;
        
        
        System.out.println("Ortalamanız: "+ avarage);
        
        if(avarage >= 55){
            System.out.print("Sinifi Gectiniz");
        }
        else{
            System.out.print("Sinifi gecemediniz!");
        }
        
      
    }
    
}

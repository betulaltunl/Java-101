import java.util.Scanner;
public class NotOrtalamasi {
     public static void main(String[] args) {
        
        int mat,fizik,kimya,turkce,tarih;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        
        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        
        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        
        System.out.println("Turkce notunuzu giriniz : ");
        turkce = input.nextInt();
        
        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        

        int toplam = (mat + fizik + kimya + kimya + turkce + tarih);
        double ortalama = toplam/6.0;
        input.close();
        System.out.println("Ortalamanız: "+ ortalama);
        
        String durum = (ortalama>=60)? "Sınıfı Gecti":"Sınıfta Kaldı";
        System.out.print(durum);

        
      
    }
    
}
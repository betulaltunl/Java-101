import java.util.Scanner;

public class Sayi_2{
    public static void main(String[] args){
        int i,add=0;

        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Bir sayi giriniz: ");
            i=scan.nextInt();
            if(i%4==0){
                add+=i;
            }
        }while(i%2==0);
        scan.close();
               
        System.out.print("Tek sayi girdiginiz icin program sonlanmistir,\ngirilen sayilardan çift ve 4'ün katı olan sayilarin toplami: "+add);

    }
}
        
        
        
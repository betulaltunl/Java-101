import java.util.Scanner;

public class Sayi{
    public static void main(String[] args){
        int i,counter=0,add=0;

        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("0 dan buyuk bir sayi giriniz: ");
            i=scan.nextInt();
        }while(i<0);
        scan.close();
        
        for(int k=0; k<=i; k++){
            if(k%12==0){
                counter++;
                add+=k;
            }
        }
        float average=add/counter;
        System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: "+average);

    }
}
        
            
        
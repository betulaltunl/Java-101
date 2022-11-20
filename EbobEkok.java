import java.util.Scanner;

public class EbobEkok{
    public static void main(String[] args) {
        int smallestNumber, counter=1, ebob=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int n1 = input.nextInt();

        Scanner inp=new Scanner(System.in);
        System.out.print("\nIkinci sayiyi giriniz: ");
        int n2 = inp.nextInt();

        if(n1>n2){
            smallestNumber=n2; 
        }
        else{
            smallestNumber=n1;
        }
        while(counter<=smallestNumber){
            if(n1%counter==0 && n2%counter==0){
                System.out.println(counter);
                ebob=counter;
            }
                counter++;
        }
        System.out.println("EBOB: "+ebob);
        int ekok =(n1*n2)/ebob;
        System.out.print("EKOK: "+ekok);
    }
}
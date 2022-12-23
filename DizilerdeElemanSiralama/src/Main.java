import java.util.Arrays;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int n = inp.nextInt();

        int[] dizi= new int[n];
        System.out.println("Dizinin elemanlarini giriniz: ");
        for (int i=0; i<n; i++){
            Scanner input = new Scanner(System.in);
            System.out.print((i+1)+". eleman: ");
            dizi[i] = input.nextInt();

        }
        Arrays.sort(dizi);
        System.out.print(Arrays.toString(dizi));
    }
}
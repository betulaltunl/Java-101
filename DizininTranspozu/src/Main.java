
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matrisin satir sayisini giriniz: ");
        int sa = scan.nextInt();
        System.out.print("Matrisin sutun sayisini giriniz: ");
        int su = scan.nextInt();
        int[][] matris=new int[sa][su];
        System.out.println("dizinin elemanlarini giriniz: ");
        for(int i=0; i<sa; i++){
            for (int k=0; k<su; k++){
                matris[i][k] = scan.nextInt();

            }
        }
        System.out.println("Dizi: ");
        for(int i=0; i<sa; i++){
            for (int k=0; k<su; k++){

                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Dizinin transpozu: ");
        for(int k=0; k<su; k++){
            for (int i=0; i<sa; i++){

                System.out.print(matris[i][k] + " ");
            }
            System.out.println();
        }
    }
}
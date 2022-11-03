import java.util.Scanner;

public class Kombinasyon{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Kumenin eleman sayisini giriniz (n): ");
        int n  = scan.nextInt();

        System.out.print("Olusturmak istediginiz grup sayisini giriniz (r): ");
        int r = scan.nextInt();
        scan.close();
        if(n<=0 || r<=0){
            System.out.print("Hatali giris!");
        }else{
            int faktoriyel_r=1,faktoriyel_n=1,fak_n_mines_r=1;
            for(int i=1; i<=n; i++){
                faktoriyel_n=faktoriyel_n*i;
            }
            for(int k=1; k<=r; k++){
                faktoriyel_r=faktoriyel_r*k;
            }
            for(int b=1; b<=n-r; b++){
                fak_n_mines_r=fak_n_mines_r*b;
            }
            int kombinasyon;
            kombinasyon=faktoriyel_n/(faktoriyel_r*fak_n_mines_r);
            System.out.print("C(n,r)= "+kombinasyon);
        }
    }
}
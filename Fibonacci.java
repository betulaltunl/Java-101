import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		

		int step, n = 0, n1 = 1, n2;
		Scanner inp = new Scanner(System.in);
		System.out.print("Eleman sayisini girin:");
		step = inp.nextInt();
        if(step <= 0){
            System.out.print("Hatalı sayı girdiniz. Lütfen 0'dan buyuk bir sayı giriniz!!");
        }else if(step == 1){
            System.out.print("0");
        }else if(step == 1 || step == 2){
            System.out.print("0, 1");
        }else if(step>2){
            System.out.print("0, 1, ");
            for (int i = 3; i <= step; i++) {   
                n2 = n + n1;
                System.out.print(n2 + ", ");
                n = n1;
                n1 = n2;
            }
        }
	}
}
               

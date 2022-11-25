import java.util.Scanner;
/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın. */
public class DeseneGoreMetot{

    static void islem(int i , int k){
          
          if(i>0){
            System.out.print(i+" ");
            i-=5;
            islem(i, k);
          }else{
            System.out.print(i+" ");
              while(i<k){
                i+=5;
                System.out.print(i+" ");
              }
            }
          } 
          public static void main(String[] args){
              Scanner inp = new Scanner(System.in);
              System.out.print("Sayı Giriniz : ");
              int number=inp.nextInt();
              int temp=number;// ilk girilen değeri sonrasında kullanmak için temp değişkenine atadım
              islem(number,temp);
          }
      }
               
         
    
import java.util.Scanner;
/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

public class KullaniciGirisi{
    public static void main(String[] args){
        String name, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı isminizi giriniz: ");
        name = input.nextLine();

        System.out.print("Password giriniz: ");
        password = input.nextLine();

        if(name.equals("betul") && password.equals("giris123")){
            System.out.print("Giris Yaptınız!");
        }
        else if(name.equals("betul")){
        
            System.out.println("Hatali Giris Yaptınız!!");
            System.out.println("Sifrenizi sıfırlamak istiyorsanız '1' i islemi bitirmek icin '0' ı seciniz.");
            int secim=input.nextInt();
            switch(secim){
                case 1:
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Yeni password giriniz: ");
                    String newPassword = inp.nextLine();
                    
                        if(newPassword.equals(password) || newPassword.equals("giris123")){
                            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");  
                        }else{
                            System.out.print("Şifre oluşturuldu");
                        }
                    break;
                case 0:
                    System.out.print("Islem sona ermistir.");
                    break;
                default:    
            
            }
        }
        
        else{
            System.out.print("!!Gecersiz kullanıcı ismi!!");
        }
    input.close();
    }
}
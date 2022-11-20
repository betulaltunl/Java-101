import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("\nParolanız : ");
            password = input.nextLine();

            if (userName.equals("betul") && password.equals("dev123")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : \n");
                    
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                            
                    select = input.nextInt();
                   
                    switch(select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Guncel bakiyeniz: "+balance);
                            break;
                        case 2: 
                            System.out.print("Para miktarı : ");
                            int pricee = input.nextInt();

                            if (pricee > balance) {
                                     System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= pricee;
                                    System.out.println("Guncel bakiyeniz: "+balance);
                                     }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        
                                    }
            }
            else{
                            right--;
                            if(right>0 && right<3){
                            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                            System.out.println("Kalan Hakkınız : " + right);
                            }
                            else if (right == 0) {
                            System.out.println("Hatalı kullanıcı adı veya şifre.\nHesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                            } 
                                    }
                    }
                }
        }
    
    
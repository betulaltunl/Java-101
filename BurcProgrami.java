import java.util.Scanner;

public class BurcProgrami{
    public static void main(String[] args){
        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.print("Kacıncı ayda dogdunuzu giriniz: ");
        month = input.nextInt();

        System.out.print("Dogdugunuz gunu giriniz: ");
        day = input.nextInt();
        input.close();
        if(month==1){
            if(day<=21){
                System.out.print("Burcunuz: OGLAK");
            }else if(day>21 && day<=31){
                System.out.print("Burcunuz: KOVA");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==2){
            if(day<=19){
                System.out.print("Burcunuz: KOVA");
            }else if(day>19 && day<=31){
                System.out.print("Burcunuz: BALIK");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==3){
            if(day<=20){
                System.out.print("Burcunuz: BALIK");
            }else if(day>20 && day<=31){
                System.out.print("Burcunuz: KOC");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==4){
            if(day<=20){
                System.out.print("Burcunuz: KOC");
            }else if(day>20 && day<=31){
                System.out.print("Burcunuz: BOGA");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==5){
            if(day<=21){
                System.out.print("Burcunuz: BOGA");
            }else if(day>21 && day<=31){
                System.out.print("Burcunuz: IKIZLER");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==6){
            if(day<=22){
                System.out.print("Burcunuz: IKIZLER");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: YENGEC");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==7){
            if(day<=22){
                System.out.print("Burcunuz: YENGEC");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: ASLAN");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==8){
            if(day<=22){
                System.out.print("Burcunuz: ASLAN");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: BASAK");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==9){
            if(day<=22){
                System.out.print("Burcunuz: BASAK");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: TERAZI");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==10){
            if(day<=22){
                System.out.print("Burcunuz: TERAZI");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: AKREP");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==11){
            if(day<=21){
                System.out.print("Burcunuz: AKREP");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: YAY");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }
        else if(month==12){
            if(day<=21){
                System.out.print("Burcunuz: YAY");
            }else if(day>22 && day<=31){
                System.out.print("Burcunuz: OGLAK");
            }else{
                System.out.print("Hatalı gun girdiniz!!");
            }
        }else{
            System.out.print("Hatalı ay girildi!");
        }
    }
}
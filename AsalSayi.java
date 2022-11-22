

public class AsalSayi {
    public static void main(String[] args) {
      
        for(int i=2;i<=100;i++){
            boolean asalSayi = true;
            for(int j =2;j<i; j++){
                if(i%j==0){
                    asalSayi=false;
                }
            }
            if (asalSayi){
                System.out.println(i);
            }
        }
    }
}
        

    
        


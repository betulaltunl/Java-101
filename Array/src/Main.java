//Bir sayı dizisindeki tekrar eden çift sayıları belirten  program

public class Main {
    static  boolean isFind(int[] arr, int value){
        for (int i:arr){
            if(i==value){
                return  true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list={3,6,10,4,10,3,7,4,4,11,7,8,12,8};
        int[] newlist=new int[list.length];
        int startIndex=0;

        for(int i=0; i< list.length;i++){
            for (int j=0; j< list.length; j++){
                if((i!=j)&&(list[i]==list[j])){
                    if(list[i]%2==0){
                        if(!isFind(newlist, list[i])) {
                            newlist[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for(int value:newlist){
            if(value!=0){
                System.out.print(value+"  ");
            }
        }

    }
}
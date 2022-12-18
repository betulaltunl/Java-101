public class Main {
    public static void main(String[] args) {

                double[] list= {1.0, 2.0, 3.0, 4.0, 5.0};
                double sum = 0;
                for (int i = 0; i < list.length; i++) {
                    sum += (1/list[i]);
                }
                System.out.println("Dizinin harnonik ortalaması: "+list.length/sum);
    }
}
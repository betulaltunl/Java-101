import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Girilecek dizinin boyutu: ");
        int n = scan.nextInt();

        int[] list= new int[n];
        System.out.println("Dizi elemanlarini giriniz: ");
        for(int k=0; k<n ; k++){
           list[k]=scan.nextInt();
        }
        System.out.println("Dizi : "+Arrays.toString(list));
        System.out.println("Tekrar sayilari: ");

        // create a HashMap to store the frequencies of the elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // iterate over the array and update the frequency of each element in the HashMap
        for (int element : list) {
            if (frequencyMap.containsKey(element)) {
                // if the element is already in the HashMap, increment its frequency by 1
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // if the element is not in the HashMap, add it with a frequency of 1
                frequencyMap.put(element, 1);
            }
        }

        // iterate over the keys (the elements) in the HashMap and print the frequency of each element
        for (int element : frequencyMap.keySet()) {
            System.out.println(element + " sayisi " + frequencyMap.get(element) + " kere tekrar edildi");
        }

    }
}
package Data_Structure.Map;

import java.util.HashMap;
import java.util.Scanner;

public class FindTheDuplicateElementsUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashMap using to find the duplicate value...
        HashMap<Integer,Integer> elements = new HashMap<>();
        boolean duplicate = false;
        int count = 1;
        System.out.print("Enter the Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        for (int i=0; i<n; i++){
            if (elements.containsKey(arr[i])){
                duplicate = true;
                System.out.print("Yes...");
                break;
            }else {
                elements.put(arr[i], count);
            }
        }
        if (!duplicate){
            System.out.print("No...");
        }
    }
}

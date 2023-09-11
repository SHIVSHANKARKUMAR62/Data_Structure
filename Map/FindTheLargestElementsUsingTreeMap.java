package Data_Structure.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class FindTheLargestElementsUsingTreeMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        System.out.print("Enter the Size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            treeMap.put(arr[i], 1);
        }
        System.out.println("Largest element is: "+treeMap.lastKey()); // lastEnter() return all the last value method used to find the largest element in TreeMap,We get only key element so we used lastKey()
        // We can also write
        System.out.print("Largest element is: "+treeMap.lastEntry().getKey());
    }
}

package Data_Structure.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class SortTheMapValueUsingTreeMap {
    public static void main(String[] args) {
        int key;
        String val;
        Scanner sc = new Scanner(System.in);
        // TheeMap using to sort the value...
        TreeMap<String,Integer> value = new TreeMap<>();
        System.out.print("Enter the Number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the value and key");
        for (int i=0; i<n; i++){
            key = sc.nextInt();
            val = sc.nextLine();
            value.put(val,key);
        }
        System.out.print("Values are: "+value);
    }
}

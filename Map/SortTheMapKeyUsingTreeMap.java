package Data_Structure.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class SortTheMapKeyUsingTreeMap {
    public static void main(String[] args) {
        int key;
        String val;
        Scanner sc = new Scanner(System.in);
        // TheeMap using to sort the value...
        TreeMap<Integer,String> value = new TreeMap<>();
        System.out.print("Enter the Number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the value and key");
        for (int i=0; i<n; i++){
            key = sc.nextInt();
            val = sc.nextLine();
            value.put(key,val);
        }
        System.out.print("Values are: "+value);
    }
}

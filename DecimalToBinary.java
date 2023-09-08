package Data_Structure;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[40];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();
        while (num>0){
            arr[i] = num%2;
            num = num/2;
            i++;
        }

        System.out.print("Binary Number is: ");

        for (int j= i-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}

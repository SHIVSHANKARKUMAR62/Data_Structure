package Data_Structure;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        long sum = 0,i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number: ");
        long num = sc.nextLong();
        while (num>0){
            sum = (long) (sum + num%10 * Math.pow(2,i));
            num = num/10;
            i++;
        }
        System.out.println("Decimal Number is: "+sum);
    }
}

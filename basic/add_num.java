package Basic;

import java.util.Scanner;

public class add_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        sc.close();

        int Sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + Sum);
    }
    
}

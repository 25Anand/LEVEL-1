package Basic;

import java.util.Scanner;

public class pattern1 {
    public static void main(String arg[]) {
        System.out.println("enter the value for which pattern is to be printed"); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package Basic;

import java.util.Scanner;

public class level_1 {
    public static void main(String arg[]) {
        int rev = 0, r;
        System.out.println("enter the no: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("Reverse No: " + rev);

    }
}

package btu;

import java.util.Scanner;

public class C {
    int a, b, c;

    void m1() {
        Scanner sc3 = new Scanner(System.in);

        System.out.print("a = ");
        a = sc3.nextInt();

        System.out.print("b = ");
        b = sc3.nextInt();

        System.out.print("c = ");
        c = sc3.nextInt();
    }

    void m2() {
        int lastDigit = a % 10;
        System.out.println("The last digit of a is: " + lastDigit);
    }

    void m3() {
        while (b >= 10)
            b /= 10;

        System.out.println("The first digit of b is: " + b);
    }

//??????
    //??????
    
    void m4(int c, int sum) {
        do {
            if (c != 0) {
                sum = sum + c % 10;
                c /= 10;
            }

            System.out.println("Sum of the digits in c" + sum);
        } while (true);

    }

}


package btu;
import java.util.Scanner;

public class A {
    int a, b;
    void m1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        a = sc.nextInt();

        System.out.print("b = ");
        b = sc.nextInt();
    }

    void m2() {
        System.out.println(a+"+"+b+"="+(a+b));
    }

    void m3() {
        System.out.println(a+"*"+b+"="+(a*b));
    }
}

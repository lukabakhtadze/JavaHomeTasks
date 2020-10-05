package btu;

import java.util.Scanner;
import java.lang.Math;

public class B {
    int a, b, c;
    void m1() {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("a = ");
        a = sc2.nextInt();

        System.out.print("b = ");
        b = sc2.nextInt();

        System.out.print("c = ");
        c = sc2.nextInt();


    }
    void m2() {
        int max = Math.max(a, b);
        if(max > b){
            max = Math.max(a, c);
        }
        else{
            max = Math.max(b, c);
        }
        System.out.println("The max number is: " + max);

    }
    void m3() {
        int min = Math.min(a, b);
        if(min < b){
            min = Math.min(a, c);
        }
        else{
            min = Math.min(b, c);
        }
        System.out.println("The min number is: " + min);
    }
}

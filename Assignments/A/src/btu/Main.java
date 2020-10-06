package btu;

import java.util.*;

public class Main //A
        {
        int x;
        String phrase;

    public Main(String phrase) {

            this.phrase = phrase;

        }

        public static void main(String[] args) {
            mainB B = new mainB("Hello");
            System.out.println(B.phrase);
            B.variable_X();
            B.xPlus();
            B.oddOrEven();
            B.variable_Y();
            B.sum();
        }

        void variable_X() {
            Scanner sc = new Scanner(System.in);
            System.out.println("x= ");
            x = sc.nextInt();

        }

        void xPlus() {
            System.out.println("(A)2nd method: x + 12 = " + (x + 12));

        }

        void oddOrEven() {
            if (x % 2 == 0) {
                System.out.println("The number is even");

            }

            else {
                System.out.println("The number is odd");

            }
    }
}

class mainB extends Main //B
    {
    int y;

    public mainB(String phrase) {
        super(phrase);
    }

    void variable_Y() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("y=");
        y = scanner.nextInt();

    }

    void sum() {
        System.out.println("(A/B)2nd method + y = " + (x + y));

    }

}


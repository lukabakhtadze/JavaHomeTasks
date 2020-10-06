package btu;

import java.util.Scanner;

public class Main {

    int a,b,c;

    public static void main(String[] args) {

        Main C = new Main();

        C.variables();
        System.out.println("2nd meth: The last digit of A is: " + C.last_dgt());
        System.out.println("3nd meth: The First digit of B is: " + C.first_dgt());
        System.out.println("4nd meth: The sum of C digits is: " + C.cDigitsSum());
        System.out.println("5nd meth: 2nd method * 3rd method: " + C.mult_of_scnd_and_thrd_meths());
        System.out.println("6th meth: 2nd method + 5th method: " + C.sum_of_scnd_and_fifth_meths());
    }

    // Method_1
    void variables() {

        Scanner sc = new Scanner(System.in);
        System.out.println("A= ");
        a = sc.nextInt();
        System.out.println("B= ");
        b = sc.nextInt();
        System.out.println("C= ");
        c = sc.nextInt();
    }

    // Method_2
    int last_dgt() {

        return a % 10;
    }

    // Method_3
    int first_dgt() {
        while (b > 9) {

            b/=10;
        }
        return b;
    }

    // Method_4
    int cDigitsSum() {
        int sum = 0;

        while(c != 0){
            sum = sum + (c%10);
            c/= 10;
        }
        return sum;
    }

    // Method_5
    int mult_of_scnd_and_thrd_meths(){
        return last_dgt() * first_dgt();
    }

    // Method_6
    int sum_of_scnd_and_fifth_meths(){
        return last_dgt() + mult_of_scnd_and_thrd_meths();
    }

}


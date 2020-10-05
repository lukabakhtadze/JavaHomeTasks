package btu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
                int x = sc.nextInt();

        System.out.print("y = ");
                int y = sc.nextInt();

        System.out.print("z = ");
                int z = sc.nextInt();

        System.out.println(frstMeth(x));
        System.out.println(scndMeth(y, z));
        System.out.println(thrdMeth(x, y, z));

    }

    private static int frstMeth(int x) {

        return 2 * x - 7;
    }

    private static int scndMeth(int y, int z) {

        return 3 * y + z;
    }

    private static int thrdMeth(int x, int y, int z) {

        return 12 * y - x + z;
    }
}




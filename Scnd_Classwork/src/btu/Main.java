package btu;

public class Main {

    public static void main(String[] args) {
        //#1
////---------------------------------------------------------
//        System.out.println("C++\nC#\njava\npascal\nphp\nJavaScript\nActionScript");
//
//    }

        //#2
////---------------------------------------------------------
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the first number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input the second number: ");
//        int num2 = in.nextInt();
//
//        System.out.println(num1 % num2);
//        System.out.println(num2 % num1);
//        }

        //#3
////----------------------------------------------------------
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input the first number: ");
//        int num1 = in.nextInt();
//
//        System.out.print("Input the second number:");
//        int num2 = in.nextInt();
//
//
//        System.out.println(num1 + num2);
//        System.out.println(num1 * num2);
//    }

        //#4
////
//    public static void main(String[] args) {
//        int number = 3;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 3 digits number:");
//        int input = sc.nextInt();
//        int length = String.valueOf(input).length();
//        while(length > 3) {
//            input = sc.nextInt();
//            length = String.valueOf(input).length();
//        }
//        sc.close();
//        String stringInput = String.valueOf(input);
//        for(int i = 0; i < stringInput.length(); i++) {
//            int j = Character.digit(stringInput.charAt(i), 10);
//            System.out.println(j);
//        }
//    }

        //#5
////-----------------------------------------------------------
//    public static void main(String[] args) {
//        int number = 4;
//        int m, n, sum =0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Press Enter and input 4 digits number:");
//        int input = sc.nextInt();
//        int length = String.valueOf(input).length();
//        m = sc.nextInt();
//        while(length > 4){
//            input = sc.nextInt();
//            length = String.valueOf(input).length();
//        }
//        sc.close();
//        while(m > 0){
//            n = m % 10;
//            sum = sum + n;
//            m = m / 10;
//        }
//        System.out.println("The sum is: " + sum);
//    }

        //#7
////-----------------------------------------------------------
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number:");
//        int digits = in.nextInt();
//        System.out.println("The sum is " + sumDigits(digits));
//    }
//
//    public static int sumDigits(long n){
//        int result = 0;
//
//        while (n > 0) {
//            result += n % 10;
//            n /= 10;
//        }
//
//        return result;
//
//    }

        //#9
////-----------------------------------------------------------
//        public static void main(String[] Strings) {
//
//
//            double minutesInYear = 60 * 24 * 365;
//            Scanner input = new Scanner(System.in);
//            System.out.print("Input the number of minutes: ");
//
//            double min = input.nextDouble();
//
//            long years = (long) (min / minutesInYear);
//            int days = (int) (min / 60 / 24) % 365;
//
//            System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//        }

        //#11
////-----------------------------------------------------------
//    public static void main(String[] args)
//    {
//
//        int i;
//        int a = 8;
//        Scanner input = new Scanner(System.in);
//        input = new Scanner(System.in);
//
//        int [] Numbers = new int[a];
//
//        System.out.print(" Please Enter 8 elements of an Array  : ");
//        for (i = 0; i < a; i++)
//        {
//            Numbers[i] = input.nextInt();
//        }
//
//        for (i = 0; i < a; i++)
//        {
//            System.out.print(Numbers[i] + "\t");
//        }
//    }

        //#12
////------------------------------------------------------------
//    public static void main(String[] args)
//    {
//
//        int i;
//        int a = 8;
//        Scanner input = new Scanner(System.in);
//        input = new Scanner(System.in);
//
//        int [] Numbers = new int[a];
//
//        System.out.print(" Please Enter 8 elements of an Array  : ");
//        for (i = 0; i < a; i++)
//        {
//            Numbers[i] = input.nextInt();
//        }
//
//        for (i = 0; i < a; i++)
//        {
//            System.out.print(Numbers[i] + "\t");
//        }
//    }
}

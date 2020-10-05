package btu.B;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[12];

        System.out.println(Arrays.toString(userNums(myArray)));
        System.out.println(Arrays.toString(randomNums(myArray)));
        moreThanSeven(myArray);
        System.out.println("2. Diapason is" + (diapason(myArray)));

    }

    private static int[] userNums(int[] myArray) {
        Scanner firstSc = new Scanner(System.in);

        for (int i=0; i<myArray.length; i++) {
            myArray[i] = firstSc.nextInt();

        }
        return myArray;
    }

    private static int[] randomNums(int[] myArray) {
        Random randomNumbers = new Random();
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = randomNumbers.nextInt(15);
        return myArray;
    }

    private static void moreThanSeven(int[] myArray) {

        for (int i=0; i<myArray.length; i++) {
            if (myArray[i] > 7)
            {
                System.out.println(myArray[i] + " Value/Index " + i);
            }
        }

    }

    private static int diapason(int[] myArray) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = myArray[0];
        int min = myArray[0];

        for (int i=1; i < myArray.length; i++) {
            if (myArray[i] > max)
            {
                max = myArray[i];
            }
        }

        for (int i=1; i < myArray.length; i++) {
            if (myArray[i] < min)
            {
                min = myArray[i];
            }
        }
        return max-min;
    }



}

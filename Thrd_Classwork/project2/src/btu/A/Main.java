package btu.A;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];

        System.out.println(Arrays.toString(userNums(myArray)));
        System.out.println(Arrays.toString(randomNums(myArray)));
        System.out.println("1. Multiplication is: " + moreIndex(myArray));
        System.out.println("2. Sum is " + lessIdnex(myArray));

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

    private static int lessIdnex(int[] myArray) {

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i=0; i<myArray.length; i++) {
            if (myArray[i] > i) {
                list.add(myArray[i]);
            }
        }
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Final " + list);
        return sum;
    }

    private static int moreIndex(int[] myArray) {

        ArrayList<Integer> myList = new ArrayList<>();

        for (int i=0; i<myArray.length; i++) {
            if (myArray[i] < i && myArray[i] != 0) {
                myList.add(myArray[i]);
            }
        }
        int sum = 1;
        for (int j : myList) {
            sum *= j;

        }
        System.out.println("Final list is: " + myList);

        return sum;
    }



}
/**
* Java 1. Homework #3
*
* @author Andrey Chuprin
* @version 20.12.2021
*/
import java.util.Arrays;
import java.util.Random;

class HomeWork3 {
    static Random random = new Random();
    public static void main(String[] args) {

    //1
    int[] arrOne = createAndFllArray(10, true, 2);
    System.out.println(Arrays.toString(arrOne));
   for (int i = 0; i < arrOne.length; i++) {
    arrOne[i] = 1 - arrOne[i];
    }
     //2
    int [] arrTwo = createAndFllArray(100, false, 1);
    System.out.println(Arrays.toString(arrTwo));

    //3
    int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
    }
        }
            System.out.println(Arrays.toString(arrThree));

    //4
    int[] [] matrix = new int [5] [5];
    for (int i = 0; i < matrix.length; i++) {
        matrix[i] [i] = 1;
        matrix[i] [matrix.length - i -1] = 1;
    }
    for (int i = 0; i < matrix.length; i++) {
        System.out.println(Arrays.toString(matrix[i]));
    }
    //5 
    int[] arrFive = createAndFllArray(15, 5);
    System.out.println(Arrays.toString(arrFive));
    }
    static int[] createAndFllArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
    static int [] createAndFllArray(int length, boolean rnd, int value) {
        int[] arr = new int [length];
        for (int i = 0; i < arr.length; i++) {
            if (rnd) {
                arr[i] = random.nextInt(value);
            } else { 
               arr[i] = + value;
            }
        }
        return arr;
    }

    static boolean checkBalanse(int[] array) {
        int sumArray = 0, sumLeft = 0;
        for (int i : array) {
            sumArray += i;
        }
        for (int i = 0; i < array.length - 1; i++) {
            sumLeft += array[i];
            if (sumLeft*2 == sumArray) {
                return true;
            }
        }
        return false;
    }
}
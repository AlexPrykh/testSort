package testSort;

import java.util.Arrays;
import java.util.Scanner;

import static testSort.Swap.swap;

public class BubleSort {
    public static void main(String[] args) {
//        Бульбашкове сортування
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int sizeArray = sc.nextInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = true;

            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                   swap(array, j -1, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

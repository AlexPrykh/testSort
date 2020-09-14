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
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length -1; j++) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

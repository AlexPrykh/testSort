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
        int out, i;
        int outLeft = 0;                    // outer border left
        int elements = array.length;
        int outRight = elements - 1;       // outer border right

        for (out = elements - 1; out > 1; out--) {

            for (i = 0; i < outRight; i++) {        // sorts the largesting elements at the end
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }

            outRight--;                  // the end of the array - the boundary of the sorted part

            for (int j = outRight; j > 0; j--) {     // sorts the smallest element to the beginning
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }

            outLeft++;
        }
        System.out.println(Arrays.toString(array));
    }
}

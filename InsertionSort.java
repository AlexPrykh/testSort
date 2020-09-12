package testSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
//        Сортування вставками
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int sizeArray = sc.nextInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
//            extract the value of the element
            int value = array[left];
//           going to the elements that before the extracted element
            int i = left - 1;
            for (; i >= 0; i--) {
//                If the extracted value is less - move the extracted element further
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
//                    if the outstretched element is larger - stop
                    break;
                }
            }
//            insert the extracted value into the free location
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}

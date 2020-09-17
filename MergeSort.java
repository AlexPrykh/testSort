package testSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    private static void mergeSort(int[] source, int left, int right) {
//        выберем разделитель, т.е. разделим пополам входной массив
        int delimiter = left + ((right - left) / 2) + 1;
        // Выполним рекурсивно данную функцию для двух половинок (если сможем разбить(
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        // Создаём временный массив с нужным размером
        int[] buffer = new int[right - left + 1];
        // Начиная от указанной левой границы идём по каждому элементу
        int cursor = left;

        for (int i = 0; i < buffer.length; i++) {

            // если итерация последняя и при этом разделитель delimiter дошёл до конца (== right)
            if (i == buffer.length - 1 && right == delimiter) {
                // значит остался лишь один элемент - крайний правый - максимальный
                buffer[i] = source[delimiter];
                break;
            } else if (delimiter > right || source[cursor] < source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension of the array: ");
        int sizeArray = sc.nextInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

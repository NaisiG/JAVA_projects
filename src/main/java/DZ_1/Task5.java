/* 5.** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить
все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ]
при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
-> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */

package DZ_1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Task5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(a));
        foo(a, 3);
        System.out.println(Arrays.toString(a));
        foo(a, -6);
        System.out.println(Arrays.toString(a));
    }

    public static void foo(int[] arr, int n) {
        int temp;
        int len = arr.length - 1;
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = arr[0];
                System.arraycopy(arr, 1, arr, 0, len);
                arr[len] = temp;
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp = arr[len];
                System.arraycopy(arr, 0, arr, 1, len);
                arr[0] = temp;
            }
        }
    }
}

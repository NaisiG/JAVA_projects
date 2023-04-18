//1. Написать метод, принимающий на вход два аргумента: len и initialValue,
//и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

package DZ_1;
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int len = f.nextInt();
        System.out.print("Введите число для массива: ");
        int initialValue = f.nextInt();
        int[] result = ArrayLen(len, initialValue);
        System.out.println(Arrays.toString(result));
        f.close();
    }

    private static int[] ArrayLen(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;

    }
}


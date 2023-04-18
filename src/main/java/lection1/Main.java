/*Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение "Привет, < Имя >"
 */

package lection1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
//        public static void ex1() {                       // Ctrl + Alt + m -вывести метод
//            Scanner myScanner = new Scanner(System.in);
//            System.out.println("Введите ваше имя: ");
//            String name = myScanner.nextLine();
//            System.out.printf("Привет, %s!%n", name);
//        }

    /* Дан массив двойных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
     */


}

    private static void ex2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int max_value = 0;
        for (int i : arr) {
            if (i == 1) count++;
            else {
                if (count > max_value) {
                    max_value = count;
                    count = 0;
                }
            }
        }
        if (count > max_value) max_value = count;
        System.out.println(max_value);
    }
}



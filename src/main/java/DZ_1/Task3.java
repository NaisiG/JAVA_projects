//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//        (можно только одну из диагоналей, если обе сложно).
//        Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

package DZ_1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        final int MAX = 5;
        int[][] arr = new int[MAX][MAX];
        for (int i = 0; i < arr.length /2 + 1 ; i++) {
            for (int j =  i; j < arr.length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - i - 1][j] = 1;
                }
            }
            for (int []row:arr){
                for (int value: row){
                    System.out.print(" " + value + " ");
                }
                System.out.println();
            }
        }
    }

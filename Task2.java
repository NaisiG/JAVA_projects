/* 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0й позиции каждого внутреннего списка содержится название жанра,
а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры(можно через консоль).
Пример:
"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
"Детектив", "Десять негритят".
"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {{"Классика ", "Преступление и наказание ", "Война и мир", "Анна Каренина"},
                {"Научная фантастика ", "Солярис ", "Ночной дозор ", "Братья Стругацкие"},
                {"Детектив ", "Десять негритят"},
                {"Фантастика ", "Хроники Нарнии ", "Гарри Поттер и философский камень ", "Грозовой перевал"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}




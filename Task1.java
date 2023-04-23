/* 1. Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"} */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("'Яблоко'");
        strList.add(Integer.toString(11));
        strList.add(Integer.toString(13));
        strList.add("'Апельсин'");
        strList.add("'Дыня'");
        strList.add(Integer.toString(17));

        System.out.print("strList => ");
        for (int i=0; i<strList.size(); i++)
            System.out.print(strList.get(i) + "  ");
        System.out.println();

        ArrayList<String> strList2 = new ArrayList<String>();
        strList2.add("11");
        strList2.add("13");
        strList2.add("17");
        strList.removeAll(strList2);

        System.out.print("strList2 => ");
        for (int i=0; i<strList.size(); i++) {
            System.out.print(strList.get(i) + " ");
        }




    }
}

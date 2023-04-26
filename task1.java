/* 1. Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.

 */
import java.util.LinkedList;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;
        System.out.println("""
                Введите значение для строки:
                Для выхода используйте 'print'""");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            list.addFirst(srtFromCons);
        scanner.close();
        String removed = list.removeFirst();
        System.out.println("Удалённый элемент: " + removed);

        System.out.println("Получился перевёрнутый список: " + list.toString());

    }
}

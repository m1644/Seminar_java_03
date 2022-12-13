package Seminar_DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DZ_01 {
    /*
    * 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
    */
    public static List<String> colorList() {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("yellow");
        list.add("green");
        return list;
    }

    /*
    * 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
    */
    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;
    }

    /*
    * 3. Вставить элемент в список в первой позиции.
    */
    public static List<String> addList(List<String> list) {
        list.add(0, "white");
        return list;
    }

    /*
    * 4. Извлечь элемент (по указанному индексу) из заданного списка.
    */
    public static String getList(List<String> list) {
        return list.get(0);
    }

    /*
    * 5. Обновить определенный элемент списка по заданному индексу.
    */
    public static List<String> replacElement(List<String> list, String firstElement, String secondElement) {
        list.set(list.indexOf(firstElement), secondElement);
        return list;
    }

    /*
    * 6. Удалить третий элемент из списка.
    */
    public static List<String> removeElement(List<String> list) {
        list.remove(2);
        return list;
    }

    /*
    * 7. Поиск элемента в списке по строке.
    */
    public static boolean searchElement(List<String> list, String element) {
        if (list.contains(element))
            return true;
        else
            return false;
    }

    /*
    * 8. Создать новый список и добавить в него несколько елементов первого списка.
    */
    public static List<String> addNewList(List<String> list) {
        List<String> newAddList = new ArrayList<>(Arrays.asList("blue", "black", "brown"));
        newAddList.addAll(Arrays.asList("red", "green"));
        return newAddList;
    }
    
    /*
    * 9. Удалить из первого списка все элементы отсутствующие во втором списке.
    */
    public static List<String> delList(List<String> list) {
        List<String> newAddList = new ArrayList<>(Arrays.asList("blue", "black", "brown"));      
        newAddList.addAll(Arrays.asList("red", "green"));
        list.retainAll(newAddList);
        return list;
    }
    
    public static void main(String[] args) {
        System.out.println("Задача 1: " + colorList());

        System.out.println("Задача 2: " + iterList(colorList()));

        System.out.println("Задача 3: " + addList(colorList()));

        System.out.println("Задача 4: " + getList(addList(colorList())));

        System.out.println("Задача 5: " + replacElement(addList(colorList()), "white", "WHITE"));

        System.out.println("Задача 6: " + removeElement(replacElement(addList(colorList()), "white", "WHITE")));

        String serchElement = "WHITE";
        System.out.println("Задача 7: " + searchElement(removeElement(replacElement(addList(colorList()), "white", "WHITE")), serchElement));

        System.out.println("Задача 8: " + addNewList(colorList()));

        System.out.println("Задача 9: ");
        System.out.println("Список 1 - " + colorList());
        System.out.println("Список 2 - " + addNewList(colorList()));
        System.out.println("Ответ: " + delList(colorList()));
    }
}

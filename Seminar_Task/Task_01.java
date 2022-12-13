package Seminar_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Task_01
 */
public class Task_01 {

    public static void main(String[] args) {

        // List list = new ArrayList();
        // list.add(12);
        // list.add("Eleven");
        // list.add(12.5f);
        // list.add(new OutOfMemoryError());
        // if (list.get(0) instanceof Integer) {
        //     int a = (int) list.get(0);
        // }

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,16));
        System.out.println(list);

        list.add(4, 16);    // добавляет объект
        System.out.println(list);

        //list.clear();     // очищает лист

        System.out.println(list.get(4));    // достаёт из списка
        System.out.println(list.indexOf(16));   // показывает индекс объекта с начала
        System.out.println(list.lastIndexOf(16));
        System.out.println(list.contains(204)); // проверяет наличие объекта(true/false)

        list.remove(11);    // удаляет объект по индексу
        System.out.println(list);

        list.remove(new Integer(16));   // удаляет объект как по значению так по индексу
        System.out.println(list);

        list.removeIf(n -> n % 1 != 0);     // удаляет объекты не кратные 1
        System.out.println(list);

        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));   // добавляет объекты списком
        System.out.println(list);

        // list.forEach(k -> {
        //     int t = k;
        //     System.out.print(k + " : ");
        //     t++;
        //     System.out.println(t);
        // });

        list.set(10, 16);     // заменяет объект    
        System.out.println(list);

        list.isEmpty();
        list.size();

        List<Integer> list1 = list.subList(0, list.size()/2);
        System.out.println(list1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        for (Integer i : list) {
            System.out.print(i);
        }
        System.out.println();

        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     int i = iterator.next();
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            int i = iterator.previous();
            System.out.print(i + " + ");
        }
        System.out.println();

        list.toArray();

        System.out.println(list);
        System.out.println(list1);
        //list.removeAll(list1);
        list.retainAll(list1);
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t0 - t1;
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t1 - t0;
            }
        });
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(4,8,12,16));
        System.out.println(list2);
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());

    }
}

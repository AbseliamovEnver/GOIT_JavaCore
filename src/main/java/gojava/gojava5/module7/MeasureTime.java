package gojava.gojava5.module7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class MeasureTime {
    public static void main(String[] args) {
        List<Integer> integerArrayList1 = new ArrayList<>(1000);
        List<Integer> integerArrayList2 = new ArrayList<>(10000);
        List<String> stringArrayList1 = new ArrayList<>(1000);
        List<String> stringArrayList2 = new ArrayList<>(10000);

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            integerArrayList1.add(i, random.nextInt());
            stringArrayList1.add(i, "Element" + i);
        }
        for (int i = 0; i < 10000; i++) {
            integerArrayList2.add(i, random.nextInt());
            stringArrayList2.add(i, "Element" + i);
        }

        List<Integer> integerLinkedList1 = new LinkedList<>(integerArrayList1);
        List<Integer> integerLinkedList2 = new LinkedList<>(integerArrayList2);
        List<String> stringLinkedList1 = new LinkedList<>(stringArrayList1);
        List<String> stringLinkedList2 = new LinkedList<>(stringArrayList2);

        TreeMap<Long, String> measureTimeIntegerList = new TreeMap<>();
        System.out.println("Comparing the runtime table of Integer: ");
        measureTimeIntegerList.put(measureTimeAdd(integerArrayList1), " \tAdd Integer Array List 1000\n");
        measureTimeIntegerList.put(measureTimeSet(integerArrayList1), " \tSet Integer Array List 1000\n");
        measureTimeIntegerList.put(measureTimeGet(integerArrayList1), " \tGet Integer Array List 1000\n");
        measureTimeIntegerList.put(measureTimeRemove(integerArrayList1), " \tRemove Integer Array List 1000\n");
        measureTimeIntegerList.put(measureTimeAdd(integerArrayList2), " \tAdd Integer Array List 10000\n");
        measureTimeIntegerList.put(measureTimeSet(integerArrayList2), " \tSet Integer Array List 10000\n");
        measureTimeIntegerList.put(measureTimeGet(integerArrayList2), " \tGet Integer Array List 10000\n");
        measureTimeIntegerList.put(measureTimeRemove(integerArrayList2), " \tRemove Integer Array List 10000\n");

        measureTimeIntegerList.put(measureTimeAdd(integerLinkedList1), " \tAdd Integer Linked List 1000\n");
        measureTimeIntegerList.put(measureTimeSet(integerLinkedList1), " \tSet Integer Linked List 1000\n");
        measureTimeIntegerList.put(measureTimeGet(integerLinkedList1), " \tGet Integer Linked List 1000\n");
        measureTimeIntegerList.put(measureTimeRemove(integerLinkedList1), " \tRemove Integer Linked List 1000\n");
        measureTimeIntegerList.put(measureTimeAdd(integerLinkedList2), " \tAdd Integer Linked List 10000\n");
        measureTimeIntegerList.put(measureTimeSet(integerLinkedList2), " \tSet Integer Linked List 10000\n");
        measureTimeIntegerList.put(measureTimeGet(integerLinkedList2), " \tGet Integer Linked List 10000\n");
        measureTimeIntegerList.put(measureTimeRemove(integerLinkedList2), " \tRemove Integer Linked List 10000\n");
        System.out.println(measureTimeIntegerList);

        TreeMap<Long, String> measureTimeStringList = new TreeMap<>();
        System.out.println("Comparing the runtime table of String: ");
        measureTimeStringList.put(measureTimeAdd(stringArrayList1), " \tAdd String Array List 1000\n");
        measureTimeStringList.put(measureTimeSet(stringArrayList1), " \tSet String Array List 1000\n");
        measureTimeStringList.put(measureTimeGet(stringArrayList1), " \tGet String Array List 1000\n");
        measureTimeStringList.put(measureTimeRemove(stringArrayList1), " \tRemove String Array List 1000\n");
        measureTimeStringList.put(measureTimeAdd(stringArrayList2), " \tAdd String Array List 10000\n");
        measureTimeStringList.put(measureTimeSet(stringArrayList2), " \tSet String Array List 10000\n");
        measureTimeStringList.put(measureTimeGet(stringArrayList2), " \tGet String Array List 10000\n");
        measureTimeStringList.put(measureTimeRemove(stringArrayList2), " \tRemove String Array List 10000\n");

        measureTimeStringList.put(measureTimeAdd(stringLinkedList1), " \tAdd String Linked List 1000\n");
        measureTimeStringList.put(measureTimeSet(stringLinkedList1), " \tSet String Linked List 1000\n");
        measureTimeStringList.put(measureTimeGet(stringLinkedList1), " \tGet String Linked List 1000\n");
        measureTimeStringList.put(measureTimeRemove(stringLinkedList1), " \tRemove String Linked List 1000\n");
        measureTimeStringList.put(measureTimeAdd(stringLinkedList2), " \tAdd String Linked List 10000\n");
        measureTimeStringList.put(measureTimeSet(stringLinkedList2), " \tSet String Linked List 10000\n");
        measureTimeStringList.put(measureTimeGet(stringLinkedList2), " \tGet String Linked List 10000\n");
        measureTimeStringList.put(measureTimeRemove(stringLinkedList2), " \tRemove String Linked List 10000\n");
        System.out.println(measureTimeStringList);
    }

    private static <T> Long measureTimeAdd(List<T> list) {
        long start = System.nanoTime();
        list.add(800, null);
        long end = System.nanoTime();
        return end - start;
    }

    private static <T> Long measureTimeSet(List<T> list) {
        long start = System.nanoTime();
        list.set(800, null);
        long end = System.nanoTime();
        return end - start;
    }

    private static <T> Long measureTimeGet(List<T> list) {
        long start = System.nanoTime();
        list.get(800);
        long end = System.nanoTime();
        return end - start;
    }

    private static <T> Long measureTimeRemove(List<T> list) {
        long start = System.nanoTime();
        list.remove(800);
        long end = System.nanoTime();
        return end - start;
    }
}
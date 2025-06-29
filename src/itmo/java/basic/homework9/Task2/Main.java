package itmo.java.basic.homework9.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 1_000_000;
        int randomSelectCount = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        long arrayListAddTime = ListBenchmark.addElements(arrayList, size);
        long arrayListRandomAccessTime = ListBenchmark.randomSelect(arrayList, randomSelectCount);

        List<Integer> linkedList = new LinkedList<>();
        long linkedListAddTime = ListBenchmark.addElements(linkedList, size);
        long linkedListRandomAccessTime = ListBenchmark.randomSelect(linkedList, randomSelectCount);

        System.out.println("ArrayList add time: " + arrayListAddTime + " ms");
        System.out.println("ArrayList random access time: " + arrayListRandomAccessTime + " ms");
        System.out.println("LinkedList add time: " + linkedListAddTime + " ms");
        System.out.println("LinkedList random access time: " + linkedListRandomAccessTime + " ms");
    }
}

/*

ArrayList add time: 22 ms
ArrayList random access time: 41 ms
LinkedList add time: 201 ms
LinkedList random access time: 90455 ms

Добавление элементов:

У ArrayList добавление работает быстрее (22 ms против 201 ms у LinkedList),
потому что он хранит элементы в массиве.

LinkedList медленнее, потому что каждый элемент — это отдельный объект-узел,
и на это тратится больше времени из-за выделения памяти.

Доступ к элементам:

ArrayList показывает очень быстрое время (41 ms), так как он легко находит элемент по индексу,
так как это обычный массив.

У LinkedList время огромное (90455 ms), потому что для каждого get() ему нужно проходить по всей
цепочке от начала списка до нужного индекса.

*/

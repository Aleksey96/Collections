package org.example;

import javax.swing.border.AbstractBorder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try {
            Name[] names100 = Collections.getNames(Collections.PATH_FILE_100_NAMES);
            Name[] names2000 = Collections.getNames(Collections.PATH_FILE_2000_NAMES);
            Name[] names5000 = Collections.getNames(Collections.PATH_FILE_5000_NAMES);
            long[] execution;

            ArrayListNames arrayListNames = new ArrayListNames();
            LinkedListNames linkedListNames = new LinkedListNames();
            StackNames stackNames = new StackNames();
            ArrayDequeNames arrayDequeNames = new ArrayDequeNames();


            execution = arrayListNames.getTimeExecuteAddingElements(names100);
            System.out.println("Среднее время вставки 100 элементов в ArrayList " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteAddingElements(names100);
            System.out.println("Среднее время вставки 100 элементов в LinkedList " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteAddingElements(names100);
            System.out.println("Среднее время вставки 100 элементов в Stack " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteAddingElements(names100);
            System.out.println("Среднее время вставки 100 элементов в ArrayDeque " + Collections.calculateAverage(execution));

            //
            Name name = new Name();
            name.setName(Collections.NAME);

            execution = arrayListNames.getTimeExecuteChangingElement(names100.length, name);
            System.out.println("Среднее время замены елемента в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteChangingElement(names100.length, name);
            System.out.println("Среднее время замены елемента в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteChangingElement(names100.length, name);
            System.out.println("Среднее время замены елемента в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteChangingElement(names100.length, name);
            System.out.println("Среднее время замены елемента в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));

            //

            execution = arrayListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));
            //

            execution = arrayListNames.getTimeExecuteGetFirstElements(arrayListNames.getPercent(names100.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetFirstElements(linkedListNames.getPercent(names100.length));
            System.out.println("Среднее время получения первых 5% элементов в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetFirstElements(stackNames.getPercent(names100.length));
            System.out.println("Среднее время получения первых 5% элементов в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetFirstElements(arrayDequeNames.getPercent(names100.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));

            //

            execution = arrayListNames.getTimeExecuteGetLastElements(names100.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetLastElements(names100.length);
            System.out.println("Среднее время получения последних 5% элементов в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetLastElements(names100.length);
            System.out.println("Среднее время получения последних 5% элементов в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetLastElements(names100.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));

            arrayListNames.clearCollection();
            linkedListNames.clearCollection();
            stackNames.clearCollection();
            arrayDequeNames.clearCollection();

            arrayListNames.getTimeExecuteAddingElements(names100);
            linkedListNames.getTimeExecuteAddingElements(names100);
            stackNames.getTimeExecuteAddingElements(names100);
            arrayDequeNames.getTimeExecuteAddingElements(names100);

            execution = arrayListNames.getTimeExecuteDeleteFirstElements(names100.length, names100);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteFirstElements(names100.length, names100);
            System.out.println("Среднее время удаления первых 5% элементов в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteFirstElements(names100.length, names100);
            System.out.println("Среднее время удаления первых 5% элементов в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteFirstElements(names100.length, names100);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteLastElements(names100.length, names100);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayList из 100 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteLastElements(names100.length, names100);
            System.out.println("Среднее время удаления последних 5% элементов в LinkedList из 100 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteLastElements(names100.length, names100);
            System.out.println("Среднее время удаления последних 5% элементов в Stack из 100 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteLastElements(names100.length, names100);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayDeque из 100 элементов " + Collections.calculateAverage(execution));

            arrayListNames.clearCollection();
            linkedListNames.clearCollection();
            stackNames.clearCollection();
            arrayDequeNames.clearCollection();


            // 2000 тысячи элементов------------------------------------------------------------------------------------------------------

            execution = arrayListNames.getTimeExecuteAddingElements(names2000);
            System.out.println("Среднее время вставки 2000 элементов в ArrayList " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteAddingElements(names2000);
            System.out.println("Среднее время вставки 2000 элементов в LinkedList " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteAddingElements(names2000);
            System.out.println("Среднее время вставки 2000 элементов в Stack " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteAddingElements(names2000);
            System.out.println("Среднее время вставки 2000 элементов в ArrayDeque " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteChangingElement(names2000.length, name);
            System.out.println("Среднее время замены елемента в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteChangingElement(names2000.length, name);
            System.out.println("Среднее время замены елемента в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteChangingElement(names2000.length, name);
            System.out.println("Среднее время замены елемента в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteChangingElement(names2000.length, name);
            System.out.println("Среднее время замены елемента в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteGetFirstElements(arrayListNames.getPercent(names2000.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetFirstElements(linkedListNames.getPercent(names2000.length));
            System.out.println("Среднее время получения первых 5% элементов в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetFirstElements(stackNames.getPercent(names2000.length));
            System.out.println("Среднее время получения первых 5% элементов в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetFirstElements(arrayDequeNames.getPercent(names2000.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteGetLastElements(names2000.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetLastElements(names2000.length);
            System.out.println("Среднее время получения последних 5% элементов в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetLastElements(names2000.length);
            System.out.println("Среднее время получения последних 5% элементов в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetLastElements(names2000.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));

            arrayListNames.clearCollection();
            linkedListNames.clearCollection();
            stackNames.clearCollection();
            arrayDequeNames.clearCollection();

            arrayListNames.getTimeExecuteAddingElements(names2000);
            linkedListNames.getTimeExecuteAddingElements(names2000);
            stackNames.getTimeExecuteAddingElements(names2000);
            arrayDequeNames.getTimeExecuteAddingElements(names2000);

            execution = arrayListNames.getTimeExecuteDeleteFirstElements(names2000.length, names2000);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteFirstElements(names2000.length, names2000);
            System.out.println("Среднее время удаления первых 5% элементов в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteFirstElements(names2000.length, names2000);
            System.out.println("Среднее время удаления первых 5% элементов в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteFirstElements(names2000.length, names2000);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteLastElements(names2000.length, names2000);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteLastElements(names2000.length, names2000);
            System.out.println("Среднее время удаления последних 5% элементов в LinkedList из 2000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteLastElements(names2000.length, names2000);
            System.out.println("Среднее время удаления последних 5% элементов в Stack из 2000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteLastElements(names2000.length, names2000);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayDeque из 2000 элементов " + Collections.calculateAverage(execution));

            arrayListNames.clearCollection();
            linkedListNames.clearCollection();
            stackNames.clearCollection();
            arrayDequeNames.clearCollection();

            //----------------------------------------------------------------- 5000 элементов


            execution = arrayListNames.getTimeExecuteAddingElements(names5000);
            System.out.println("Среднее время вставки 5000 элементов в ArrayList " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteAddingElements(names5000);
            System.out.println("Среднее время вставки 5000 элементов в LinkedList " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteAddingElements(names5000);
            System.out.println("Среднее время вставки 5000 элементов в Stack " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteAddingElements(names5000);
            System.out.println("Среднее время вставки 5000 элементов в ArrayDeque " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteChangingElement(names5000.length, name);
            System.out.println("Среднее время замены елемента в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteChangingElement(names5000.length, name);
            System.out.println("Среднее время замены елемента в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteChangingElement(names5000.length, name);
            System.out.println("Среднее время замены елемента в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteChangingElement(names5000.length, name);
            System.out.println("Среднее время замены елемента в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteFindElement(name);
            System.out.println("Среднее время поиска елемента в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteGetFirstElements(arrayListNames.getPercent(names5000.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetFirstElements(linkedListNames.getPercent(names5000.length));
            System.out.println("Среднее время получения первых 5% элементов в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetFirstElements(stackNames.getPercent(names5000.length));
            System.out.println("Среднее время получения первых 5% элементов в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetFirstElements(arrayDequeNames.getPercent(names5000.length));
            System.out.println("Среднее время получения первых 5% элементов в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteGetLastElements(names5000.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteGetLastElements(names5000.length);
            System.out.println("Среднее время получения последних 5% элементов в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteGetLastElements(names5000.length);
            System.out.println("Среднее время получения последних 5% элементов в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteGetLastElements(names5000.length);
            System.out.println("Среднее время получения последних 5% элементов в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteElement(name);
            System.out.println("Среднее время удаления елемента в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));

            arrayListNames.clearCollection();
            linkedListNames.clearCollection();
            stackNames.clearCollection();
            arrayDequeNames.clearCollection();

            arrayListNames.getTimeExecuteAddingElements(names5000);
            linkedListNames.getTimeExecuteAddingElements(names5000);
            stackNames.getTimeExecuteAddingElements(names5000);
            arrayDequeNames.getTimeExecuteAddingElements(names5000);

            execution = arrayListNames.getTimeExecuteDeleteFirstElements(names5000.length, names5000);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteFirstElements(names5000.length, names5000);
            System.out.println("Среднее время удаления первых 5% элементов в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteFirstElements(names5000.length, names5000);
            System.out.println("Среднее время удаления первых 5% элементов в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteFirstElements(names5000.length, names5000);
            System.out.println("Среднее время удаления первых 5% элементов в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));


            execution = arrayListNames.getTimeExecuteDeleteLastElements(names5000.length, names5000);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = linkedListNames.getTimeExecuteDeleteLastElements(names5000.length, names5000);
            System.out.println("Среднее время удаления последних 5% элементов в LinkedList из 5000 элементов " + Collections.calculateAverage(execution));

            execution = stackNames.getTimeExecuteDeleteLastElements(names5000.length, names5000);
            System.out.println("Среднее время удаления последних 5% элементов в Stack из 5000 элементов " + Collections.calculateAverage(execution));

            execution = arrayDequeNames.getTimeExecuteDeleteLastElements(names5000.length, names5000);
            System.out.println("Среднее время удаления последних 5% элементов в ArrayDeque из 5000 элементов " + Collections.calculateAverage(execution));

        } catch (IOException e) {
            System.out.println("Файл не обнаружен");
        }
    }
}

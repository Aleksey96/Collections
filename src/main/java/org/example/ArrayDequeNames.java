package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDequeNames extends Collections {

    ArrayDequeNames() {
        collection = new ArrayDeque<Name>();
    }

    @Override
    protected void changeRandomElement(int index, Name name) {
        Object[] names = collection.toArray();
        System.out.println("Номер элемента в ArrayDeque : " + index + ", изменяемое имя: " + ((Name) names[index]).getName());
        names[index] = name;
        collection = new ArrayDeque<>(Arrays.asList(names));
    }

    @Override
    protected boolean findName(Name name) {
        if (((ArrayDeque<Name>) collection).contains(name)) {
            for (Name n : (ArrayDeque<Name>) collection) {
                if (n.equals(name)) {
                    System.out.println("Элемент " + n);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    protected boolean deleteElement(Name name) {
        return ((ArrayDeque<Name>) collection).removeFirstOccurrence(name);
    }

    @Override
    protected void getFirstElements(int leftBound) {
        Iterator<Name> iterator = ((ArrayDeque<Name>) collection).iterator();
        for (int i = 0; i < leftBound; i++) {
            System.out.print(i + " " + iterator.next() + " ");
        }
    }

    @Override
    protected void getLastElements(int percent) {
        Iterator<Name> iterator = ((ArrayDeque<Name>) collection).descendingIterator();
        for (int i = collection.size() - 1; i >= collection.size() - percent; i--) {
            System.out.print(i + " " + iterator.next() + " ");
        }
    }

    @Override
    protected void deleteFirstElements(int percent) {
        for (int i = 0; i < percent; i++) {
            ((ArrayDeque<Name>) collection).pop();
        }
    }

    @Override
    protected void deleteLastElements(int percent) {
        for (int i = 0; i < percent; i++) {
            ((ArrayDeque<Name>) collection).pollLast();
        }
    }
}

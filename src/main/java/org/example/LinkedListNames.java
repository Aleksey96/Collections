package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListNames extends Collections {

    LinkedListNames() {
        collection = new LinkedList<Name>();
    }

    @Override
    protected void changeRandomElement(int index, Name name) {
        ((List<Name>) collection)
                .set(index, name);
        System.out.println("Новое имя " + ((List<Name>) collection).get(index).getName() + " c индексом " + index);
    }

    @Override
    protected boolean findName(Name name) {
        int index = ((List<Name>) collection).indexOf(name);
        System.out.println((index != -1) ? ((List<Name>) collection).get(index) : null);
        return (index != -1) ? true : false;
    }

    @Override
    protected boolean deleteElement(Name name) {
        return ((List<Name>) collection).remove(name);
    }

    @Override
    protected void getFirstElements(int leftBound) {
        for (int i = 0; i < leftBound; i++) {
            System.out.print(i + " : " + ((List<Name>) collection).get(i));
        }
    }

    @Override
    protected void getLastElements(int percent) {
        for (int i = collection.size() - percent; i < collection.size() - 1; i++) {
            System.out.print(i + " : " + ((List<Name>) collection).get(i));
        }
    }

    @Override
    protected void deleteFirstElements(int percent) {
        for (int i = 0; i < percent; i++) {
            ((List<Name>) collection).remove(0);
        }
    }

    @Override
    protected void deleteLastElements(int percent) {
        int index = collection.size() - percent;
        for (int i = 0; i < percent; i++) {
            ((List<Name>) collection).remove(index);
        }
    }
}

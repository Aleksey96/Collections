package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Collections {
    public final static String PATH_FILE_100_NAMES = "C:/Users/Alexey/IdeaProjects/Collections/src/100names.json";
    public final static String PATH_FILE_2000_NAMES = "C:/Users/Alexey/IdeaProjects/Collections/src/2000names.json";
    public final static String PATH_FILE_5000_NAMES = "C:/Users/Alexey/IdeaProjects/Collections/src/5000names.json";
    public static final String NAME = "Jack";
    protected Collection collection;

    protected abstract void getFirstElements(int leftBound);

    protected abstract void getLastElements(int percent);

    protected abstract void deleteFirstElements(int percent);

    protected abstract void deleteLastElements(int percent);

    protected abstract void changeRandomElement(int index, Name name);

    protected abstract boolean deleteElement(Name name);

    protected abstract boolean findName(Name name);

    protected Collection getCollection() {
        return collection;
    }

    protected int getRandomIndex(int arraySize) {
        return (int) (Math.random() * arraySize);
    }

    protected void printFindResult(boolean isFind) {
        System.out.println((isFind) ? "Элемент найден" : "Элемент не найден");
    }

    protected void printDeleteResult(boolean isFind) {
        System.out.println((isFind) ? "Элемент удален" : "Элемент не удален");
    }

    public int getPercent(int collectionSize) {
        return (int) (collectionSize * 0.05);
    }

    protected void addAllElements(Name[] names) {
        collection.addAll(Arrays.asList(names));
    }

    public static Name[] getNames(String pathFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Name[] names = objectMapper.readValue(new File(pathFile), Name[].class);
        return names;
    }

    protected long executeTimeAddAllElements(Name[] names) {
        long start = System.nanoTime();
        addAllElements(names);
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeChangeElement(int index, Name name) {
        long start = System.nanoTime();
        changeRandomElement(index, name);
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeFindElement(Name name) {
        long start = System.nanoTime();
        printFindResult(findName(name));
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeFirstElements(int leftBound) {
        long start = System.nanoTime();
        getFirstElements(leftBound);
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeGetLastElements(int percent) {
        long start = System.nanoTime();
        getLastElements(percent);
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeDeleteElement(Name name) {
        long start = System.nanoTime();
        printDeleteResult(deleteElement(name));
        long finish = System.nanoTime();
        return finish - start;
    }

    protected void clearCollection() {
        this.collection.clear();
    }

    protected long[] getTimeExecuteAddingElements(Name[] names) {
        long[] executions = new long[5];
        for (int i = 0; i < executions.length; i++) {
            if (!collection.isEmpty()) {
                collection.clear();
            }
            executions[i] = executeTimeAddAllElements(names);
        }
        return executions;
    }

    protected long[] getTimeExecuteChangingElement(int size, Name name) {
        int index = -1;
        long[] executions = new long[5];
        for (int i = 0; i < executions.length; i++) {
            index = getRandomIndex(size);
            executions[i] = executeTimeChangeElement(index, name);
        }
        return executions;
    }

    protected long[] getTimeExecuteFindElement(Name name) {
        long[] executions = new long[5];
        for (int i = 0; i < executions.length; i++) {
            executions[i] = executeTimeFindElement(name);
        }
        return executions;
    }

    protected long[] getTimeExecuteGetFirstElements(int bound) {
        long[] executions = new long[5];
        for (int i = 0; i < executions.length; i++) {
            executions[i] = executeTimeFirstElements(bound);
        }
        return executions;
    }

    protected long[] getTimeExecuteGetLastElements(int size) {
        long[] executions = new long[5];
        int percent = getPercent(size);
        for (int i = 0; i < executions.length; i++) {
            executions[i] = executeTimeGetLastElements(percent);
        }
        return executions;
    }

    protected long[] getTimeExecuteDeleteElement(Name name) {
        long[] executions = new long[5];
        for (int i = 0; i < executions.length; i++) {
            executions[i] = executeTimeDeleteElement(name);
        }
        return executions;
    }


    public static long calculateAverage(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    protected long[] getTimeExecuteDeleteLastElements(int size, Name[] names) {
        long[] executions = new long[5];
        int percent = getPercent(size);
        for (int i = 0; i < executions.length; i++) {
            if (collection.size() < size) {
                collection.clear();
                addAllElements(names);
            }
            executions[i] = executeTimeDeleteLastElements(percent);
        }
        return executions;
    }

    protected long[] getTimeExecuteDeleteFirstElements(int size, Name[] names) {
        long[] executions = new long[5];
        int percent = getPercent(size);
        for (int i = 0; i < executions.length; i++) {
            if (collection.size() < size) {
                collection.clear();
                addAllElements(names);
            }
            executions[i] = executeTimeDeleteFirstElements(percent);
        }
        return executions;
    }

    protected long executeTimeDeleteLastElements(int percent) {
        long start = System.nanoTime();
        deleteLastElements(percent);
        long finish = System.nanoTime();
        return finish - start;
    }

    protected long executeTimeDeleteFirstElements(int percent) {
        long start = System.nanoTime();
        deleteFirstElements(percent);
        long finish = System.nanoTime();
        return finish - start;
    }
}

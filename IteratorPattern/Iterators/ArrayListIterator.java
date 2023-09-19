package IteratorPattern.Iterators;

import java.util.ArrayList;

public class ArrayListIterator<T> implements CustomIteratorInterface<T> {
    private ArrayList<T> arrayList;
    private int position;

    public ArrayListIterator(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
        this.position = 0;
    }

    public ArrayListIterator(ArrayList<T> arrayList, int position) {
        this.arrayList = arrayList;
        this.position = position;
    }

    @Override
    public boolean hasNext() {
        return (position < arrayList.size());
    }

    @Override
    public T next() {
        return arrayList.get(position++);
    }
}

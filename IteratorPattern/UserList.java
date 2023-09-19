package IteratorPattern;

import java.util.ArrayList;

import IteratorPattern.Iterators.ArrayListIterator;
import IteratorPattern.Iterators.CustomIteratorInterface;

public class UserList {
    private ArrayList<User> uList = new ArrayList<>();

    public UserList () {
        this.uList.add(new User("Param", 25));
        this.uList.add(new User("Parminder", 25));
        this.uList.add(new User("Meenu", 21));
        this.uList.add(new User("Baljeet", 21));
        this.uList.add(new User("Nirmal", 42));
    }

    public CustomIteratorInterface<User> getIterator() {
        ArrayListIterator<User> myArrayListIterator = new ArrayListIterator<>(uList);
        return myArrayListIterator;
    }
}

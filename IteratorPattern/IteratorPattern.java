package IteratorPattern;

import IteratorPattern.Iterators.CustomIteratorInterface;

public class IteratorPattern {
    public static void main(String[] args) {
        UserList uList = new UserList();
        CustomIteratorInterface<User> iterator = uList.getIterator();
    
        while(iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user.getName() + " : " + user.getAge());
        }
    }
}

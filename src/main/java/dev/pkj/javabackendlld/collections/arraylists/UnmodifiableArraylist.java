package dev.pkj.javabackendlld.collections.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class UnmodifiableArraylist {
    public static void main(String[] args) {
        unmodifiableList();
    }

    public static final void unmodifiableList() {
        final List<String> ls = new ArrayList<>(Arrays.asList("one", "two", "three"));
        final List<String> unmodiList = List.of(ls.toArray(new String[]{}));
//        unmodiList.add("four");
        ListIterator<String> list = unmodiList.listIterator();
        while(list.hasNext()) {
            System.out.println(list.next());
        }

    }

}

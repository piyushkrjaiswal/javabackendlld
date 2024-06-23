package dev.pkj.javabackendlld.collections.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IneratorToList {
    public static void main(String[] args) {
        Iterator<Integer> iterator = Arrays.asList(1, 2, 3).iterator();
        List<Integer> ls = new ArrayList<>();
        while(iterator.hasNext()) {
            ls.add(iterator.next());
        }

        for(Integer number : ls) {
            System.out.print(number + " ");
        }
    }
}

package dev.pkj.javabackendlld.collections.arraylists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SingleRandomItem {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 3, 4, 2, 6, 5);
        Random rm = new Random();
        int randomElement = ls.get(rm.nextInt(ls.size() - 1 ));
        System.out.println(randomElement);

        // Random series
        Collections.shuffle(ls);
        int randomSeriesLength = 3;
        List<Integer> randomSeries = ls.subList(0, randomSeriesLength);
        System.out.println(Arrays.toString(randomSeries.toArray()));
    }
}

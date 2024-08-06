package dev.pkj.javabackendlld.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Words {
    public static void main(String[] args) {
        String s = "I am Piyush Piyush";
        String regex  = "[\\s]";
        String [] arr = s.split(regex);

        System.out.println(arr.length);
        int longestString = 0;
        HashMap<String, Integer> hm = new HashMap<>();
        int totalLength = 0;
        for(int i = 0; i < arr.length; i++) {
            int aSize = arr[i].length();
            longestString = Math.max(longestString, aSize);
            if(hm.containsKey(arr[i])) {
                int val = hm.get(arr[i]);
                hm.put(arr[i], val+1);
            } else {
                hm.put(arr[i], 1);
            }

            totalLength += arr[i].length();
        }
        System.out.println(longestString);

        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(totalLength/ arr.length);



    }
}

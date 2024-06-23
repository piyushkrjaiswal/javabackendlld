package dev.pkj.javabackendlld.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
        Book book1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2 = new Book(02,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book book3 = new Book(103,"Operating System","Galvin","Wiley",6);

        map.put(1, book1);
        map.put(2, book2);
        map.put(3, book3);

        for(Map.Entry<Integer, Book> entry: map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + "Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);

        }


    }
}

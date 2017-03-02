package ru.geekbrains.java.lesson3.collection;

import java.util.ArrayList;

/**
 * Created by Евгений on 01.03.2017.
 */
public class MainCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> unique = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("juice");
        arrayList.add("tomato");
        arrayList.add("uncle");
        arrayList.add("apple");
        arrayList.add("fruit");
        arrayList.add("milk");
        arrayList.add("fanta");
        arrayList.add("apple");
        arrayList.add("milk");

        for (int i = 0; i < arrayList.size(); i++) {
            String arrayList1 = arrayList.get(i);
            for (String s : arrayList) {
                if (!s.equals(arrayList1)) unique.add(s);
            }
        }

        System.out.println(unique);

    }
}

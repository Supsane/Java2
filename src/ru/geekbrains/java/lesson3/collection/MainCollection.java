package ru.geekbrains.java.lesson3.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Евгений on 01.03.2017.
 */
public class MainCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
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

        HashSet<String> hs = new HashSet<>();
        hs.addAll(arrayList);

        //список уникальных слов
        System.out.println(hs);

        //Сколько раз встречается каждое слово
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : arrayList) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, 0);
            }
            hashMap.put(s, hashMap.get(s) + 1);
        }

        for (String word: hashMap.keySet()) {
            System.out.println(word + " " + hashMap.get(word));
        }

    }
}

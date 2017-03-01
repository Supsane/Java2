package ru.geekbrains.java.lesson3;

import java.util.ArrayList;

/**
 * Created by Евгений on 01.03.2017.
 */
public class PhoneBook {

    String surname;
    String number;

    public PhoneBook(String surname, String number) {
        this.surname = surname;
        this.number = number;
    }

    static ArrayList<PhoneBook> phoneBooks = new ArrayList<PhoneBook>();

    public static void main(String[] args) {
        addEntry("Ivanov", "123-45-965");
        addEntry("Ivanov", "13-75-9654");
        addEntry("Ivanov", "8-920-251-91-14");
        addEntry("Smirnov", "548-76123");
        addEntry("Sidorov", "5764-4986-447");
        addEntry("Petrov", "578-95-3568");
        addEntry("Sobolev", "498-1475-2275");
        addEntry("Vasilev", "5784-454-76");

        getEntry("Ivanov");
    }

    public static void addEntry(String surname, String number) {
        PhoneBook entry = new PhoneBook(surname, number);
        phoneBooks.add(entry);
    }

    public static void getEntry (String surname) {
        for (PhoneBook p: phoneBooks) {
            if (p.surname.equals(surname)) {
                System.out.println(surname + ": " + p.number);
            }
        }
    }
}

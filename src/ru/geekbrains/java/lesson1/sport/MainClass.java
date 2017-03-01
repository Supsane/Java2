package ru.geekbrains.java.lesson1.sport;

import ru.geekbrains.java.lesson1.sport.competitors.*;
import ru.geekbrains.java.lesson1.sport.course.*;

public class MainClass {
    public static void main(String[] args) {
        Team team1 = new Team("Team1", new Competitor[] {new Human("Bob"), new Cat("Barsik"), new Dog("Bobik")});
        Team team2 = new Team("Team2", new Competitor[] {new Dog("Sharik"), new Human("Chak"), new Cat("Muska"), new Dog("Palkan")});
        Cource cource = new Cource(new Obstacle[] {new Cross(300), new Wall(2), new Cross(800), new Water(5)});

        cource.doIt(team1.getCompetitors());
        cource.doIt(team2.getCompetitors());

        System.out.println("\n===== RESULTS =====\n");

        team1.result();
        team2.result();
    }
}

package ru.geekbrains.java.lesson1.sport.course;

import ru.geekbrains.java.lesson1.sport.competitors.Competitor;

/**
 * Created by Евгений on 23.02.2017.
 */
public class Cource {
    private Obstacle[] obstacles;

    public Cource(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Competitor[] competitors) {
        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
            }
        }
    }
}

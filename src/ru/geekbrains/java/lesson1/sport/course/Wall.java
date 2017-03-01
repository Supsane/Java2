package ru.geekbrains.java.lesson1.sport.course;

import ru.geekbrains.java.lesson1.sport.competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

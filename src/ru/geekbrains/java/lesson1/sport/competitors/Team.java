package ru.geekbrains.java.lesson1.sport.competitors;

/**
 * Created by Евгений on 23.02.2017.
 */
public class Team {
    private String nameTeam;
    private Competitor[] competitors;

    public Team(String nameTeam, Competitor[] competitors) {
        this.nameTeam = nameTeam;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void result() {
        for (Competitor c : competitors) {
            c.result();
        }
    }
}

package dev.wu.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "perk")
public class Perk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String xpObjectives;

    private String gameVer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXpObjectives() {
        return xpObjectives;
    }

    public void setXpObjectives(String xpObjectives) {
        this.xpObjectives = xpObjectives;
    }

    public String getGameVer() {
        return gameVer;
    }

    public void setGameVer(String gameVer) {
        this.gameVer = gameVer;
    }

    @Override
    public String toString() {
        return "Perk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xpObjectives='" + xpObjectives + '\'' +
                ", gameVer='" + gameVer + '\'' +
                '}';
    }
}

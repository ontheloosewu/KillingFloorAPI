package dev.wu.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zed")
public class Zed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String abilities;

    @Column(name = "zed_type")
    @Enumerated(EnumType.STRING)
    private ZedType zedType;

    private String resistances;

    private String weaknesses;

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

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public ZedType getZedType() {
        return zedType;
    }

    public void setZedType(ZedType zedType) {
        this.zedType = zedType;
    }

    public String getResistances() {
        return resistances;
    }

    public void setResistances(String resistances) {
        this.resistances = resistances;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    @Override
    public String toString() {
        return "Zed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abilities='" + abilities + '\'' +
                ", zedType=" + zedType +
                ", resistances='" + resistances + '\'' +
                ", weaknesses='" + weaknesses + '\'' +
                '}';
    }
}

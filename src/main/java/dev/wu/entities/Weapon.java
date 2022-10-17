package dev.wu.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "weapon")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int tier;

    private int price;

    private int weight;

    private int magazine;

    @Column(name = "total_ammo")
    private int totalAmmo;

    @Column(name = "damage_type")
    private String damageType;

    private String originated;

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

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMagazine() {
        return magazine;
    }

    public void setMagazine(int magazine) {
        this.magazine = magazine;
    }

    public int getTotalAmmo() {
        return totalAmmo;
    }

    public void setTotalAmmo(int totalAmmo) {
        this.totalAmmo = totalAmmo;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getOriginated() {
        return originated;
    }

    public void setOriginated(String originated) {
        this.originated = originated;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                ", price=" + price +
                ", weight=" + weight +
                ", magazine=" + magazine +
                ", totalAmmo=" + totalAmmo +
                ", damageType='" + damageType + '\'' +
                ", originated='" + originated + '\'' +
                '}';
    }
}

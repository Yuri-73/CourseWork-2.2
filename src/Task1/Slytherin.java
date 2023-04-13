package Task1;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int overbearing; //жажда власти

    public Slytherin(String name, int witchcraft, int transgressDistance, int cunning, int determination, int ambition, int resourcefulness, int overbearing) {
        super(name, witchcraft, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.overbearing = overbearing;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getOverbearing() {
        return overbearing;
    }

    @Override
    public String toString() {
        return "факультет Slytherin {" + "Полное имя = '" + getName() +
                "', Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбициозность = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + overbearing +
                ", Волшебство = " + getWitchcraft() +
                ", Трансгрессия = " + getTransgressDistance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && overbearing == slytherin.overbearing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, overbearing);
    }
}

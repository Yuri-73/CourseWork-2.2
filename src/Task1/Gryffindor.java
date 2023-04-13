package Task1;

import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Gryffindor(String name, int witchcraft, int transgressDistance, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "факультет Gryffindor {" + "Полное имя = '" + getName() +
                "'," + " Благородство = " + nobility +
                ", Честь = " + honor +
                ", Храбрость = " + bravery +
                ", Волшебство = " + getWitchcraft() +
                ", Трансгрессия = " + getTransgressDistance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }
}

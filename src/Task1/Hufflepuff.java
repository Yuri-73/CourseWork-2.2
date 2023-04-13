package Task1;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int diligence; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String name, int witchcraft, int transgressDistance, int diligence, int loyalty, int honesty) {
        super(name, witchcraft, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "факультет Hufflepuff {" + "Полное имя = '" + getName() +
                "', Трудолюбие = " + diligence +
                ", Верность = " + loyalty +
                ", Честность = " + honesty +
                ", Волшебство = " + getWitchcraft() +
                ", Трансгрессия = " + getTransgressDistance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diligence, loyalty, honesty);
    }
}

package Task1;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int intelligence; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creativity; //креатив

    public Ravenclaw(String name, int witchcraft, int transgressDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgressDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "факультет Ravenclaw {" + "Полное имя = '" + getName() +
                "', Ум = " + intelligence +
                ", Мудрость = " + wisdom +
                ", Остроумие = " + wit +
                ", Творчество = " + creativity +
                ", Волшебство = " + getWitchcraft() +
                ", Трансгрессия = " + getTransgressDistance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligence, wisdom, wit, creativity);
    }
}

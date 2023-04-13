package Task1;

public class Hogwarts {
     private String name; //Полное имя студента Hogwarts
     private int witchcraft; //волшебство
     private int transgressDistance; //трансгрессирование на расстояние

    public Hogwarts(String name, int witchcraft, int transgressDistance) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgressDistance = transgressDistance;
    }
    //Сеттеры никому не делал, потому что менять свойства не собираюсь
    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }
}

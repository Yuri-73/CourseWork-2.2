package Task1;

public class MethodicalService {
    public static void studentDescription(Hogwarts hogwarts) {
        System.out.println("Вывод суммы качеств для определённого студента: " + hogwarts);
    }

    public static void comparisonStudentGryffindor(Gryffindor student1, Gryffindor student2) { //Сравнение суммы свойств двух студентов из факультета Gryffindor (используются свойства как этого факультета, так и школы Hogwarts вместе)
        System.out.println("Результат сравнения студентов одного факультета по сумме качеств:");
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getHonor() + student1.getBravery()) > (student2.getTransgressDistance() + student2.getWitchcraft() + student2.getHonor() + student2.getBravery())) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        }
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getHonor() + student1.getBravery()) < (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getHonor() + student2.getBravery())) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
        if (student1.equals(student2)) {
            System.out.println(student2.getName() + " и " + student1.getName() + " равны по всем свойствам");
        }
    }
    public static void comparisonStudentHufflepuff(Hufflepuff student1, Hufflepuff student2) { //Сравнение суммы свойств двух студентов из факультета Hufflepuff (используются свойства как этого факультета, так и школы Hogwarts вместе)
        System.out.println("Результат сравнения студентов одного факультета по сумме качеств:");
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getDiligence() + student1.getLoyalty() + student1.getHonesty()) > (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getDiligence() + student2.getLoyalty() + student2.getHonesty())) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        }
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getDiligence() + student1.getLoyalty() + student1.getHonesty()) < (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getDiligence() + student2.getLoyalty() + student2.getHonesty())) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
        if (student1.equals(student2)) {
            System.out.println(student2.getName() + " и " + student1.getName() + " равны по всем свойствам");
        }
    }
    public static void comparisonStudentRavenclaw(Ravenclaw student1, Ravenclaw student2) { //Сравнение суммы свойств двух студентов из факультета Ravenclaw (используются свойства как этого факультета, так и школы Hogwarts вместе)
        System.out.println("Результат сравнения студентов одного факультета по сумме качеств:");
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity()) > (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity())) {
            System.out.println(student1.getName() + " лучший Гоктевранец, чем " + student2.getName());
        }
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativity()) < (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativity())) {
            System.out.println(student2.getName() + " лучший Гоктевранец, чем " + student1.getName());
        }
        if (student1.equals(student2)) {
            System.out.println(student2.getName() + " и " + student1.getName() + " равны по всем свойствам");
        }
    }
    public static void comparisonStudentSlytherin(Slytherin student1, Slytherin student2) { //Сравнение суммы свойств двух студентов из факультета Slytherin (используются свойства как этого факультета, так и школы Hogwarts вместе)
        System.out.println("Результат сравнения студентов одного факультета по сумме качеств:");
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getOverbearing()) > (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getOverbearing())) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        }
        if ((student1.getWitchcraft() + student1.getTransgressDistance() + student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getOverbearing()) < (student2.getWitchcraft() + student2.getTransgressDistance() + student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getOverbearing())) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        }
        if (student1.equals(student2)) {
            System.out.println(student2.getName() + " и " + student1.getName() + " равны по всем свойствам");
        }
    }
    public static void comparisonStudentHogwarts(Hogwarts student1, Hogwarts student2) { //Сравнение суммы свойств двух студентов разных факультетов (используются свойства только школы Hogwarts)
        System.out.println("Результат сравнения студентов разных факультетов по сумме качеств:");
        if ((student1.getWitchcraft() + student1.getTransgressDistance()) > (student2.getWitchcraft() + student2.getTransgressDistance())) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        }
        if ((student1.getWitchcraft() + student1.getTransgressDistance()) < (student2.getWitchcraft() + student2.getTransgressDistance())) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }
        if (student1.equals(student2)) {
            System.out.println(student2.getName() + " и " + student1.getName() + " равны по всем свойствам");
        }
    }
}

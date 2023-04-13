package Task1;

public class Main {

    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 75, 86, 85, 89, 77);
        Gryffindor weasley = new Gryffindor("Рон Уизли", 51, 78, 85, 64, 56);
        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", 75, 86, 85, 89, 77);

        Slytherin malfoy = new Slytherin("Драко Малфой", 77, 66, 85, 48, 91, 82, 95);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 74, 60, 75, 48, 91, 47, 89);
        Slytherin goyle = new Slytherin("Грегори Гойл", 74, 61, 75, 48, 91, 47, 89);

        Hufflepuff smith = new Hufflepuff("Захария Смит", 37, 41, 77, 91, 88);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", 34, 40, 76, 90, 87);
        Hufflepuff fletchley = new Hufflepuff("Джастин Финч-Флетчли", 33, 39, 75, 89, 86);

        Ravenclaw сhung = new Ravenclaw("Чжоу Чанг", 27, 38, 92, 77, 66, 83);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 26, 37, 91, 76, 65, 82);
        Ravenclaw belby = new Ravenclaw("Маркус Белби", 26, 37, 91, 76, 65, 82);

        MethodicalService methodicalService = new MethodicalService();

        methodicalService.studentDescription(potter); //Вывод на печать общих свойств студента как по своему факультету Gryffindor, так и по всей школе Hogwarts вместе
        System.out.println("");
        methodicalService.studentDescription(smith); //Вывод на печать общих свойств студента как по своему факультету Hufflepuff, так и по всей школе Hogwarts вместе
        System.out.println("");
        methodicalService.studentDescription(сhung); //Вывод на печать общих свойств студента как по своему факультету Ravenclaw, так и по всей школе Hogwarts вместе
        System.out.println("");
        methodicalService.studentDescription(malfoy); //Вывод на печать общих свойств студента как по своему факультету Slytherin, так и по всей школе Hogwarts вместе
        System.out.println("");
        methodicalService.comparisonStudentGryffindor(potter, weasley); //Сравнение суммы свойств двух студентов из факультета Gryffindor (используются свойства как этого факультета, так и школы Hogwarts вместе)
        methodicalService.comparisonStudentGryffindor(potter, granger);
        System.out.println("");
        methodicalService.comparisonStudentHufflepuff(smith, diggory); //Сравнение суммы свойств двух студентов из факультета Hufflepuff (используются свойства как этого факультета, так и школы Hogwarts вместе)
        methodicalService.comparisonStudentHufflepuff(diggory, fletchley);
        System.out.println("");
        methodicalService.comparisonStudentRavenclaw(сhung, patil); //Сравнение суммы свойств двух студентов из факультета Ravenclaw (используются свойства как этого факультета, так и школы Hogwarts вместе)
        methodicalService.comparisonStudentRavenclaw(patil, belby);
        System.out.println("");
        methodicalService.comparisonStudentSlytherin(goyle, malfoy); //Сравнение суммы свойств двух студентов из факультета Slytherin (используются свойства как этого факультета, так и школы Hogwarts вместе)
        methodicalService.comparisonStudentSlytherin(malfoy, montague);
        System.out.println("");
        methodicalService.comparisonStudentHogwarts(potter, smith); //Сравнение суммы свойств двух студентов разных факультетов (используются свойства только школы Hogwarts)
        methodicalService.comparisonStudentHogwarts(granger, malfoy);
    }
}


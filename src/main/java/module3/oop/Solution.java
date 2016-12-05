package main.java.module3.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateJava = dateFormat.parse("01.12.2016");
        Date dateQA = dateFormat.parse("31.12.2016");
        Date dateFrontend = dateFormat.parse("01.01.2017");

        Course[] courses = new Course[5];
        courses[0] = new Course(dateJava, "Java Core");
        courses[1] = new Course(175, "Java Core", "Andrey Mudrevskiy");
        courses[2] = new Course(dateQA, "QA");
        courses[3] = new Course(120, "Android", "Koziulia");
        courses[4] = new Course(dateFrontend, "Frontend");

        Student studentAbseliamov = new Student("Enver", "Abseliamov", 6);
        Student studentSmith = new Student("Smith", courses);

        CollegeStudent collegeStudentIvanov = new CollegeStudent("Ivan", "Ivanov", 1);
        CollegeStudent collegeStudentPetrov = new CollegeStudent("Petrov", courses);
        CollegeStudent collegeStudentSidorov = new CollegeStudent("Vasia", "Petrov", 2, "Go IT", 10, 120L);

        SpecialStudent specialStudentKoziulia = new SpecialStudent("Andrew", "Koziulia", 4);
        SpecialStudent specialStudentKovalenko = new SpecialStudent("Kovalenko", courses);
        SpecialStudent specialStudentMudrevskiy = new SpecialStudent("Andrey", "Mudrevskiy", 3, 156L, "A.mudr@gmail.com");
    }
}
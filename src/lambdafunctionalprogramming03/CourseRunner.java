package lambdafunctionalprogramming03;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {

        // create a method to check if all average scores are greater than given number

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 152);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();

        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkAverageScoreGreaterThanGivenNumber(coursesList, 90));//true
    }

    public static boolean checkAverageScoreGreaterThanGivenNumber(List<Courses> coursesList, double num) {

        return coursesList.stream().allMatch(t -> t.getAvarageScore() > num);
    }
}

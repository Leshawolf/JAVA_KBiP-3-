package zad2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void Check(ArrayList<Student> students) {
        students.removeIf(s -> s.AverageMark() < 3);
        for (Student s : students) {
            s.setCourse(s.getCourse() + 1);
        }
    }

    public static void printStudents(ArrayList<Student> studens, int course) {
        for (Student s : studens) 
        {
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
    	try {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Даша", 992, 3, new int[]{9, 8, 9, 10}));
        students.add(new Student("Глаша", 992, 3, new int[]{8, 7, 10, 8}));
        students.add(new Student("Аркаша", 992, 3, new int[]{8, 9, 10, 8}));
        students.add(new Student("Аркаша2", 992, 3, new int[]{1, 3, 2, 2}));

        Check(students);
        printStudents(students, 4);
        System.out.println(students.toString());
    	}
    	catch (Exception e) {
    	System.out.println(e.getMessage());
    	}
    }
}
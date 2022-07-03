package zad1;

import java.util.ArrayList;
public class Main {

    public static void Check(ArrayList<Student> students) {
        students.removeIf(s -> s.AverageMark() < 3);
        for (Student s : students) {
            s.setCourse(s.getCourse()+1);
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
        students.add(new Student("Даша", 222, 3, new int[]{9, 8, 9, 4}));
        students.add(new Student("Глаша", 122, 4, new int[]{3, 5, 2, 2}));
        students.add(new Student("Аркаша", 999, 5, new int[]{4, 4, 6, 6}));
        Check(students);

        printStudents(students, 3);
        System.out.println(students.toString());
    	}
    	catch (Exception e) {
    	System.out.println(e.getMessage());
    	}
    }
}
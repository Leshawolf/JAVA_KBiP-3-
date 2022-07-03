package zad2;

import java.util.Arrays;
import java.util.Date;

public class Student {
    public String name;
    public int group;
    public int course;
    public int[] marks;

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, int group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    @Override
    public String toString() {return "Информация: \n"+"Имя " + name + "\nГруппа: " + group + "\nКурс: " + course + "\nОтметки: "+Arrays.toString(marks) + "\n======================\n";}
    public double AverageMark()
    {
        double sum=0;
        for (int i=0; i< marks.length; i++)
        {
            sum+=marks[i];
        }
        return sum/ marks.length;
    }
}

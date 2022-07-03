package zad1;

import java.util.Arrays;

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
    public String toString() {return "Имя " + name + " Группа: " + group + " Курс: " + course + " Отметки: "+Arrays.toString(marks) + '\n';}
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

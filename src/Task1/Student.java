package Task1;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Course c){
    courses.add(c);
    }
    public Student(String name) {
        this.name=name;
    }


    public String toString() {
        return name + courses;
    }
}


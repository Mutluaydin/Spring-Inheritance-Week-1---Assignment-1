package ch.test;

import java.util.List;

public class Classroom {

    private List<Student> students;
    private Teacher teacher;
    private String location;
    private String name;

    public Classroom(List<Student> students, Teacher teacher, String location, String name) {
        this.students = students;
        this.teacher = teacher;
        this.location = location;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

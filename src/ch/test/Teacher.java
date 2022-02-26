package ch.test;

public class Teacher extends Person {

    private String specialty;

    public Teacher(String firstName, String lastName, int birthday, String specialty) {
        super(firstName, lastName, birthday);
        this.specialty = specialty;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

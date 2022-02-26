package ch.test;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthday;

    public Person(String firstName, String lastName, int birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
}

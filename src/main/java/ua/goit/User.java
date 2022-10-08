package ua.goit;

public class User {
    private final String name;
    private final String lastName;

    public User(String name, String surname) {
        this.name = name;
        this.lastName = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return lastName;
    }

    @Override
    public String toString() {
        return "ua.goit.User{" +
                "name='" + name + '\'' +
                ", surname='" + lastName + '\'' +
                '}';
    }
}

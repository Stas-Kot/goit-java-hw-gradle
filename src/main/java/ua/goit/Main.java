package ua.goit;

public class Main {
    public static void main(String[] args) {
        User user = new User("Stas", "Kotelnykov");
        Convert convert = new Convert();
        String userToJson = convert.toJson(user);
        System.out.println(userToJson);
    }
}

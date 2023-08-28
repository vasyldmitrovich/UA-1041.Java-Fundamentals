public class Main {
    public static void main(String[] args) {
        String[] users = {
                "Potter", "Lion", "Speedy", "Geniuuuus", "sdfghjhgx", "aa"
        };
        for (var user : users) {
            System.out.printf("User '%s' is %svalid%n", user, validate(user) ? "" : "in");
        }
    }

    public static boolean validate(String username) {
        return username.matches("\\w{3,15}");
    }
}
public class Main {
    public static void main(String[] args) {
        String lastName = "Osypova";
        String firstName = "Maryna";
        String middleName = "Serhiivna";
        String s1 = "%s %c.%c.".formatted(lastName, firstName.charAt(0), middleName.charAt(0));
        System.out.println(s1);

        System.out.println(firstName);

        String s2 = "%s %s %s".formatted(firstName, middleName, lastName);
        System.out.println(s2);
    }
}
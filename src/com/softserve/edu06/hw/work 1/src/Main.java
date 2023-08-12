public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[]{
                new Eagle("brown feather", true),
                new Swallow("black and white feather", true),
                new Penguin("black and white feather", true),
                new Kiwi("brown feather", true)
        };

        for (var Birds : birds) {
            System.out.println(Birds);
            Birds.fly();
        }

    }
}

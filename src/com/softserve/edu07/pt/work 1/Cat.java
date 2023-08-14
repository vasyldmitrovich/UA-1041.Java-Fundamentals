public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Cat does \"Mew\"");
    }

    @Override
    public void feed() {
        System.out.println("Cat eats fish");
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> dynamicArray = new ArrayList<>();
        dynamicArray.add(new HeavyBox(0, "A"));
        dynamicArray.add(new HeavyBox(2, "B"));
        dynamicArray.add(new HeavyBox(3, "C"));
        dynamicArray.add(new HeavyBox(4, "D"));
        dynamicArray.add(new HeavyBox(5, "E"));
        System.out.println(dynamicArray);

        var element = dynamicArray.get(0);
        element.setWeight(element.getWeight() + 1);
        System.out.println(dynamicArray);

        dynamicArray.remove(dynamicArray.size() - 1);
        System.out.println(dynamicArray);

        dynamicArray.clear();
        System.out.println(dynamicArray);

    }
}

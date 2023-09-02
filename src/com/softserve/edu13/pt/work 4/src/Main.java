import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(count(nums, i -> i > 4));
        System.out.println(count(nums, i -> i % 2 == 0));
        System.out.println(count(nums, i -> true));
    }
    public static int count(int[] numbers, IntPredicate condition) {
        int counter = 0;
        for (int i : numbers) {
            if (condition.test(i))
                counter++;
        }
        return counter;
    }
}
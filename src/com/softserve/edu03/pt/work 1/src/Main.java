import java.util.Scanner;
    class Num {
        static final Scanner SCANNER = new Scanner(System.in);
        static int getTotal(int a, int b) {
            return a + b;
        }
        static double getAverage(int a, int b) {
            return (a + b) * 0.5;
        }
        static int getNumber(String prompt) {
            System.out.println(prompt);
            return SCANNER.nextInt();
        }
        public static void main(String[] args) {
            var first = getNumber("Enter first number: ");
            var second = getNumber("Enter second number: ");
            var sum = getTotal(first, second);
            var average = getAverage(first, second);
            System.out.printf("The sum of %s and %s is %s\n",
                    first, second, sum);
            System.out.printf("The average of %s and %s is %s\n",
                    first, second, average);
        }
    }
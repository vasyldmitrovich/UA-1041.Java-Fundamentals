package com.softserve.edu09.practicaltask2;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.edu09.practicaltask2.Main.SCANNER;

public class RemoveDuplicate {
    private String[] numbers;

    public RemoveDuplicate() {
    }

    public RemoveDuplicate(String[] numbers) {
        this.numbers = numbers;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }
    public void promptNumbers(){
        System.out.println("Please provide an array of numbers");
        String line = SCANNER.nextLine();
        setNumbers(line.split(",\\s*"));
    }
    public void removeDup() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int el = Integer.parseInt(numbers[i]);
            if (!(list.contains(el))) {
                list.add(el);
            }
        }
        System.out.println("Array without duplicates");
        System.out.println(list);
    }
}

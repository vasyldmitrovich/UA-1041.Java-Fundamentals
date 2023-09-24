package com.softserve.edu11.hw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    // ввести речення
    // з речення вибрати всі цифри (в тому числі дабл, розділені крапкою)
    // та замінити знайдені значення на конвертовані
    // формат знак долара ($), за яким слідує будь-яка кількість цифр, крапка та дві цифри після крапки.
    public static ArrayList<Object> getNumbersFromArray(ArrayList list) {
        Pattern p = Pattern.compile("(\\d+\\.\\d+)|\\d+");
        var newList = new ArrayList<>();
        int j = 0;
        String v = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                var vv=new StringBuilder(list.get(i).toString());
                if (vv.lastIndexOf(".")>0){
                    vv.deleteCharAt(vv.length() - 1);
                }
                v = vv.toString();
            } else {
                v = list.get(i).toString();
            }
            Matcher m = p.matcher(v);
            if (m.matches()) {
                newList.add(Double.parseDouble(v));
                j++;
            }
        }
        System.out.println(newList);
        return newList;
    }

    public static ArrayList changedNumbers(ArrayList list){
        var listNewFormat = new ArrayList<>();
        var changedValue = "";
        for (int i = 0; i < list.size(); i++) {
            var d = list.get(i);
            changedValue = "$" + d;
            listNewFormat.add(i,changedValue);
        }
        System.out.println(listNewFormat);
        return listNewFormat;
    }

    public static void replacedFormatNumbers(ArrayList list, String sentence){
        var newFormatList = changedNumbers(list);
        var s= sentence;
        for (int i = 0; i < list.size(); i++) {
            s = sentence.replace(list.get(i).toString(),newFormatList.get(i).toString());
        }
        System.out.println(s);
    }

}

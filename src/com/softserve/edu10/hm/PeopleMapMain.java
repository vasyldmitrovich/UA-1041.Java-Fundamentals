package com.softserve.edu10.hm;

import java.util.HashMap;
import java.util.Map;

import static com.softserve.edu10.hm.PeopleMap.removeStudent;

public class PeopleMapMain {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Anderson", "Mike");
        hashMap.put("Smith", "Nick");
        hashMap.put("Drake", "Sara");
        hashMap.put("Anderson", "Ann");
        hashMap.put("Jackson", "Rick");
        hashMap.put("Jackson", "Linda");
        hashMap.put("Jackson", "Kelly");
        hashMap.put("Smith", "Grace");
        hashMap.put("Jonas", "Nick");
        hashMap.put("Connor", "Kit");
        System.out.println(hashMap);
        removeStudent(hashMap, "Rick");
        System.out.println(hashMap);
    }
}

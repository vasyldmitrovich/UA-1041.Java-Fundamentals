package com.softserve.edu10.hm;

import java.util.HashMap;
import java.util.Map;

public class PeopleMap {
    public static void removeStudent(Map<String, String> map, String firstName) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }
}

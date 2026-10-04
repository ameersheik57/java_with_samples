package com.practise.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();

        data.put("A", 1);
        data.put("B", 2);
        data.put("C", 3);

        for(Map.Entry<String, Object> entry: data.entrySet())
            System.out.println(entry);

        Iterator i = data.entrySet().iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}

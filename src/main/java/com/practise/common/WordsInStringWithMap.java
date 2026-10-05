package com.practise.common;

import java.util.HashMap;
import java.util.Map;

public class WordsInStringWithMap {

    public static void main(String[] args) {

        String statement = "Hello Sheik Ameer";

        String[] words = statement.split(" ");

        Map<String, String> wordsWithMap = new HashMap<>();

        for(String word: words) {
            wordsWithMap.put(word, null);
        }

        System.out.println(wordsWithMap.keySet());

    }

}

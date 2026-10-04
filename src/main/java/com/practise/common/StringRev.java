package com.practise.common;

public class StringRev {

    public static void main(String[] args) {

        String s = "Ameer";

        int l = s.length() - 1;

        for(int i = l; i >= 0; i--) {

            System.out.print(s.charAt(i));

        }

    }

}

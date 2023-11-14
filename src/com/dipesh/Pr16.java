package com.dipesh;

import java.util.Map;
import java.util.TreeMap;

public class Pr16 {
    static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();

        String[] arr =str.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Write a program to make frequency count of words in a given text˳";

        count_freq(str);
    }
}


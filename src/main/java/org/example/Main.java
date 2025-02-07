package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> empIds = new HashMap<>();
        empIds.put("John",12345);
        empIds.put("Carl",54321);

        System.out.println(empIds.get("John"));
        System.out.println(empIds.containsKey("Carl"));

        System.out.println(empIds);
       int a= 3;
       int b = 7;
       swap(a,b );
    }

    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped a: " + a + " b: "+ b);
    }
}
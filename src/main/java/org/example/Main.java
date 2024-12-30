package org.example;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       int a= 5;
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
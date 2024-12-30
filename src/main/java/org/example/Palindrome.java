package org.example;

public class Palindrome {
    public static String simplifyString(String str){
        String result = str.replaceAll("[^a-zA-Z0-9]","");
        return result.toLowerCase();
    };

    public static boolean isPalindrome(String str){
final  var simplified = simplifyString(str);
        System.out.println("simplified: "+ simplified);
final var reverseSimplified = new StringBuilder(simplified).reverse().toString();
        System.out.println("string builder : " + new StringBuilder("1234").reverse());
        System.out.println("reverseSimplified: " + reverseSimplified);
return  reverseSimplified.equals(simplified);
    };
}

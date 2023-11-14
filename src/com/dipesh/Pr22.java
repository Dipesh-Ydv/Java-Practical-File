package com.dipesh;

public class Pr22 {
    public static void main(String[] args) {
        MyString myString = new MyString("Hello World ");

        System.out.println(myString.equal("Hello World")); // true
        System.out.println(myString.reverse()); // "dlroW olleH"
        System.out.println(myString.changeCase(true)); // "HELLO WORLD "
        System.out.println(myString.trim()); // "Hello World"
    }
}

class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean equal(String anotherStr) {
        return str.equals(anotherStr);
    }

    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }

    public String changeCase(boolean toUpperCase) {
        if (toUpperCase) {
            return str.toUpperCase();
        } else {
            return str.toLowerCase();
        }
    }

    public String trim() {
        return str.trim();
    }
}
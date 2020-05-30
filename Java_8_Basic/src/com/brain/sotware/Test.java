package com.brain.sotware;
public class Test {

    public static void main(String[] args) {

        String password = "password123";

       System.out.println( password.chars() //IntStream
                .mapToObj(x -> (char) x)//Stream<Character>
                .count());

    }

}
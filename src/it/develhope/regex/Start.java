package it.develhope.regex;

public class Start {

    public static void main(String[] args) {

        String string = "are you able to climb, are you able to swim or are you able to fly?";
        String result = string.replaceAll("\s*are\s*","_XYZ");
        System.out.println(result);

    }
}

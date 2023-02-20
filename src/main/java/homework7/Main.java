package src.main.java.homework7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int generatedNumber = (int) (Math.random() * 25);
        String input = "";
        StringBuilder stringBuilder = new StringBuilder("###############");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Guess the Word Game!");

        input = scanner.next();

        while (!words[generatedNumber].equals(input)) {

            for (int i = 0; i < input.length() && i < words[generatedNumber].length(); i++) {


                if (input.charAt(i) == words[generatedNumber].charAt(i)) {

                    stringBuilder.setCharAt(i, input.charAt(i));
                }

            }


            System.out.println("No! Try again! You`ve got this correct letters: " + stringBuilder);
            input = scanner.next();


        }
        System.out.println("You Win!");


    }


    static int findSymbolOccurance(String string, char character) {

        int characterCount = 0;
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == character) {
                characterCount++;
            }

        }
        return characterCount;

    }

    static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    static String stringReverse(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    static boolean isPalindrome(String input) {
        return stringReverse(input).equals(input);
    }


}

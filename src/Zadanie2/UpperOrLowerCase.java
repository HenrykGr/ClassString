package Zadanie2;

import java.util.Scanner;

class UpperOrLowerCase {
    public static void main(String[] args) {
        String words = getText();
        words = changeText(words);
        System.out.println("Tekst po zmianie: ");
        System.out.println(words);
    }

    private static String changeText (String words) {
        char firstLetter = words.charAt(0);
        if (Character.isUpperCase(firstLetter)) {
            words = words.toUpperCase();
        } else if (Character.isLowerCase(firstLetter)) {
           words = words.toLowerCase();
        }
        return words;
    }

    private static String getText() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź dowolny tekst: ");
        String words = input.nextLine();
        return words;
    }
}
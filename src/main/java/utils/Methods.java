package utils;

import java.util.ArrayList;
import java.util.List;

public abstract class Methods {

    // You will be given a number and you will
    // need to return it as a string in Expanded Form
    //example : expandedForm(12); # Should return "10 + 2"
    //          expandedForm(42); # Should return "40 + 2"
    public static String expandedForm(int num) {
        String[] str = Integer.toString(num).split("");
        String result;
        List<String> l = new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {
            if (Integer.valueOf(str[i]) > 0) {
                String s = str[i];
                for (int j = i; j < str.length - 1; j++) {
                    s += '0';
                }
                l.add(s);
            }
        }
        result = l.toString();
        result = result.substring(1, result.length() - 1).replace(",", " +");
        System.out.println(result);

        return result;
    }

    //function that takes in a string of one or more words, and returns the same string,
    // but with all five or more letter words reversed
    //Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
    //          spinWords( "This is a test") => returns "This is a test"
    //          spinWords( "This is another test" )=> returns "This is rehtona test"
    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] splitSentence = sentence.split(" ");

        for (String word : splitSentence) {
            if (word.length() > 4) {
                sb.append(new StringBuilder(word).reverse().toString() + " ");
            } else {
                sb.append(word + " ");
            }
        }
        return sb.toString().trim();
    }

    //Write a function that accepts an array of 10 integers (between 0 and 9),
    // that returns a string of those numbers in the form of a phone number.
    // createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("(");
        for (int i = 0; i < numbers.length; i++) {
            phoneNumber.append(numbers[i]);
            if (i == 2) {
                break;
            }
        }
        phoneNumber.append(") ");
        for (int i = 3; i < numbers.length; i++) {
            phoneNumber.append(numbers[i]);
            if (i == 5) {
                break;
            }
        }
        phoneNumber.append("-");
        for (int i = 6; i < numbers.length; i++) {
            phoneNumber.append(numbers[i]);
        }
        return phoneNumber.toString();
    }

    // Check to see if a string has the same amount of 'x's and 'o's.
    // The method must return a boolean and be case insensitive. The string can contain any char.
    // Example : XO("ooxx") => true
    //           XO("xooxx") => false
    public static boolean checkXÖ(String str){
        char x1 = 'x';
        char x2 = 'o';

        int l = 0;
        int k = 0;
        boolean resultat = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == x1) {
                l++;
            } else if (str.toLowerCase().charAt(i) == x2) {
                k++;
            }
        }
        if(l == k){
            resultat = true;
            return resultat;
        }
        return resultat;
    }
}

package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String ans = "Hello World";
        return ans;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){

        return firstSegment +  secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String ans = firstSegment + secondSegment;
        return ans;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String ans = input.substring(0, 3);
        return ans;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input)
    {
        return input.substring(input.length()-3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){

        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int charPos;
        int stringLen;
        char answer;
        if(inputValue.length() % 2 ==0){
            charPos = inputValue.length() / 2-1;
            stringLen = 2;
        }else{
            charPos= inputValue.length()/ 2;
            stringLen = 1;
        }

        String ans = inputValue.substring(charPos, charPos + stringLen);


        return null;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] firWord = spaceDelimitedString.split(" ", 2);
        String ans = firWord[0];
        return ans;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] secWord = spaceDelimitedString. split(" ",2);
        String  ans = secWord[1];
        return ans;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String ans = "";
        for(int q = stringToReverse.length()-1;q >= 0; q--){
            ans = ans + stringToReverse.charAt(q);
        }
        return ans;
    }
}

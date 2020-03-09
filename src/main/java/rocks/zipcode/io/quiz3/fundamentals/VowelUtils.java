package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    public static Boolean hasVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean hasVowels = false;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length; j++)
                if (word.charAt(i) == vowels[j])

                    hasVowels = true;
        }
        return hasVowels;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String lower = word.toLowerCase();
        Integer result = -1;
        outerloop:
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 4; j++) {
                if (word.charAt(i) == vowels[j]) {
                    result = i;
                    break outerloop;
                }
            }
        }
        return result;

    }
    public static Boolean startsWithVowel(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean starts = false;
        String lower = word.toLowerCase();
        for (int j = 0; j < 4; j++) {
            if (lower.charAt(0) == vowels[j]) {
                starts = true;
            }
        }
        return starts;
    }
    public static Boolean isVowel(Character character) {

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            return true;
        }
        else return false;
    }
}

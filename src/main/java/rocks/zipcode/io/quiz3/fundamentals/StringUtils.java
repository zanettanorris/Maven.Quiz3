package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        if (indexToCapitalize < str.length()) {
            sb.setCharAt(indexToCapitalize, Character.toUpperCase(sb.charAt(indexToCapitalize)));
        }
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor) {
            return true;
        } else return false;
    }

    public static String[] getAllSubStrings(String string) {

        String[] result = new String[getNumberOfSubStrings(string)];
        for (int j = 0; j<= getNumberOfSubStrings(string); j++) {
                for (int i = 0; i < (string.length()); i++) {
                  for (int len = 1; len < (string.length()); len++){
                     result[j] = string.substring(i, len);
                }
            }
        }
        return result;
    }
    public static Integer getNumberOfSubStrings(String input) {
        Integer len = input.length();
        for (int n = input.length()-1; n > 1; n--) {
            len = len + n;
        }
        return len;
    }
}

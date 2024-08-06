package dev.pkj.javabackendlld.uniqueCharacters;

import java.util.HashMap;
import java.util.HashSet;

public class CheckUnique {

    public static Boolean uniqueCharacterCheck(String str) {
        int len = str.length();
        if(len <= 1) {
            return true;
        }

        char firstChar = str.charAt(0);

        if(str.substring(1).indexOf(firstChar) != -1) {
            return false;
        }

        return uniqueCharacterCheck(str.substring(1));

    }

    public static void main(String[] args) {
        String str = "Piyush";
        String str1 = "Naman";

        System.out.println(uniqueCharacterCheck(str));
        System.out.println(uniqueCharacterCheck(str1));
    }





}

//Written by Matt Fazza
package com.ctc;

//Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?

import java.util.*;

public class IsUnique {

    //O(n^2) and doesn't utilize additional data structures
    public static boolean isUniqueNaive(String str) {

        //if string is unique chars
        for(int i = 0; i < str.length(); i++ ){

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)) {

                    if (j == i) {
                        continue;
                    }

                    return false;
                }

            }
        }
        return true;
    }


    //O(n) approach
    //This function places characters in a hashtable.  Whenever it has a collision, it means the string isn't unique
    public static boolean isUniqueHash(String str){

        Hashtable<Character, Integer> letterCheck = new Hashtable<Character, Integer>();

        for(int i = 0; i < str.length(); i++){

                if(letterCheck.get(str.charAt(i)) == null){

                    letterCheck.put(str.charAt(i), 1);

                } else {
                    return false;
                }
        }
        return true;
    }



    public static void main(String[] args) {

        String myStr = "whatever";
        //boolean unique = isUniqueNaive(myStr);
        boolean unique = isUniqueHash(myStr);

        if(unique == true){
            System.out.println(myStr + " only has unique characters.");
        }else{
            System.out.println(myStr + " has repeated characters.");
        }

    }
}

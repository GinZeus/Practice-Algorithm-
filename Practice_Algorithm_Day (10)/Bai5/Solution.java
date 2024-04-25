/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day10.LongestWord;

/**
 *
 * @author datng
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        String[] words = {"a","banana","app","appl","ap","apply","apple"};
        String result = longestWord(words);
        System.out.println(result);
        
    }
}

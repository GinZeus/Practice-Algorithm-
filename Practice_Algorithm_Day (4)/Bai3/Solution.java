/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day4.Anagram;

/**
 *
 * @author datng
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static void sortCharArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] charA = a.toLowerCase().toCharArray();
            char[] charB = b.toLowerCase().toCharArray();
            sortCharArray(charA);
            sortCharArray(charB);
            String resultA = new String(charA);
            String resultB = new String(charB);
            return resultA.equals(resultB);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

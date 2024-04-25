/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day8.SherlockValidString;

/**
 *
 * @author datng
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
        Map<Character,Integer> map = new HashMap<>();
        char[] chArr = s.toCharArray();
        for (char c:chArr){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        
        System.out.println(map);
        int freq = map.get(s.charAt(0));
        int error = 0;
        for (int value:map.values()){
            if (freq!=value){
                if (value == 1 && error<1){
                    error++;
                } else if (Math.abs(freq-value)>1){
                    return "NO";
                } else {
                    error++;
                }
            }
            if (error>1){
                return "NO";
            }
        }
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);
        System.out.println(result);
        bufferedReader.close();
    }
}

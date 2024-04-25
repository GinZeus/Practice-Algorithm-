/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day8.SpReduceStr;

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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String superReducedString(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if (!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        if (stack.isEmpty()){
            return "Empty String";
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        String result = sb.reverse().toString();
        return result;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);
        System.out.println(result);
        bufferedReader.close();
    }
}

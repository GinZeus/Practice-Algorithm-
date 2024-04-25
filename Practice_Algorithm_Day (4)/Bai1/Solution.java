/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day4.CamelCase;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    
    public static int camelcase(String s) {
    // Write your code here
        int count=1;
        char[] charArr=s.toCharArray();
        for (char c:charArr){
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = camelcase(s);
        System.out.println(result);
    }
}

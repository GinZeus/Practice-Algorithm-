/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day9.RomanToInt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();    
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);       
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                result -= m.get(s.charAt(i));
            } else {
                result += m.get(s.charAt(i));
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String roman = sc.nextLine();
        int result = romanToInt(roman);
        System.out.println(result);
    }
}

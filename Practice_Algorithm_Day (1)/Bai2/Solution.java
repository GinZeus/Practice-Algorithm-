/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringReduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String result="";
        Map<Character, Integer> strMap = new HashMap<>();
        char[] charArr= str.toCharArray();
        for (char c:charArr){
            if (strMap.containsKey(c)){
                continue;
            } else {
                strMap.put(c, 1);
                result+=c;
            }
        }
        System.out.println(result);
    }
}

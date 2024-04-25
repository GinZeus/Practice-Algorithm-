/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day15.KeyboardRow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static String[] findWords(String[] words) {
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> list = new ArrayList<>();
        
        for (String word:words){
            char[] charArr = word.toLowerCase().toCharArray();
            if (check(charArr, keyboard[0])||check(charArr, keyboard[1])||check(charArr, keyboard[2])){
                list.add(word);
            }
        }
        String[] result = new String[0];
        result = list.toArray(result);
        return result;
    }
    public static boolean check(char[] charArr, String row){
        for(char c:charArr){
            if (row.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        String[] result = findWords(s);
        for (String r:result){
            System.out.println(r);
        }
    }
}

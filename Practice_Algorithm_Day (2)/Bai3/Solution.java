/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpecialMultiple;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author datng
 */
public class Solution {

    public static String solve(int n) {
        // Write your code here
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while (!q.isEmpty()){
            String numStr = q.poll();
            Long num = Long.parseLong(numStr);
            if (num%n==0) {
                return numStr;
            }
            q.add(numStr+"0");
            q.add(numStr+"9");
        }
        return null;
    }

    public static void main(String[] args) {
        String result = solve(1111);
        System.out.println(result);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day3.ReverseStr;

/**
 *
 * @author datng
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse ="";
        for (int i = 0; i < A.length(); i++) {
            reverse = A.charAt(i) + reverse;
        }
        if (A.equals(reverse)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

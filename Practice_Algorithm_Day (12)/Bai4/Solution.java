/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day12.PowerOfFour;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static boolean isPowerOfFour(int n) {
        if (n==0) return false;
        if (n==1) return true;
        if (n%4!=0) return false;
        return isPowerOfFour(n/4);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfFour(n));
    }
}

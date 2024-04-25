/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day14.ClimbingStairs;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = climbStairs(n);
        System.out.println(result);
    }
}

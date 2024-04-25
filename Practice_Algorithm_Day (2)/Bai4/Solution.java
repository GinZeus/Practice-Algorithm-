/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SumSeries;

/**
 *
 * @author datng
 */
public class Solution {

    public static long summingSeries(long n) {
        long mod = (long) Math.pow(10, 9) + 7;
        return ((n % mod) * (n % mod)) % mod;
    }

    public static void main(String[] args) {
        long sum = summingSeries(3);
        System.out.println(sum);
    }
}

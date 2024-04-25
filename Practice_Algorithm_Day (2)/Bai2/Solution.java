/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HandShake;

/**
 *
 * @author datng
 */
public class Solution {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int handshake(int n) {
        // Write your code here

        if (n == 1) {
            return 0;
        } else {
            int result = factorial(n) / (2 * factorial(n - 2));
            return result;
        }
    }

    public static void main(String[] args) {
        int result = handshake(1);
        System.out.println(result);
    }
}

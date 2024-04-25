/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day14.MaxProfit;

import java.util.Scanner;

/**
 *
 * @author datng
 */
class Solution {

    public static int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxPro = 0;

        for (int i = 1; i < prices.length; i++) {
            maxPro = Math.max(maxPro, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }

        return maxPro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = maxProfit(arr);
        System.out.println(result);
    }
}

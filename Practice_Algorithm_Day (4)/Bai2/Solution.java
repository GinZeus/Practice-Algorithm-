/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day4.SimpleArrSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int num : ar) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int result = simpleArraySum(list);
        System.out.println(result);
    }
}

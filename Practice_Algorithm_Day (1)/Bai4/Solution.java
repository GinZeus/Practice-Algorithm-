/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PascalTriangle;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {

    public int GiaiThua(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * GiaiThua(a - 1);
        }
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        Solution p = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int a = p.GiaiThua(i) / (p.GiaiThua(j) * p.GiaiThua(i - j));
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }

}

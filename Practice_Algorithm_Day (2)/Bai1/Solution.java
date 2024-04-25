/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StrangeGrid;

/**
 *
 * @author datng
 */
public class Solution {

    public static int strangeGrid(int r, int c) {
        // Write your code here
        int[] even_Row = {0, 2, 4, 6, 8};
        int[] odd_Row = {1, 3, 5, 7, 9};
        int result;
        if (r % 2 != 0) {
            result = (r / 2) * 10 + even_Row[c-1];
        } else {
            result = ((r-1) / 2) * 10 + odd_Row[c-1];
        }
        return result;

    }

    public static void main(String[] args) {
        int result = strangeGrid(6, 3);
        System.out.println(result);
    }
}

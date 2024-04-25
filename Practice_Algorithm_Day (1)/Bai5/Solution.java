/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Color;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author datng
 */
public class Solution {

    public static boolean checkColor(String str) {
        int red = 0, green = 0, blue = 0, yellow = 0;
        for (char c : str.toCharArray()) {
            if (c == 'R') {
                red++;
            } else if (c == 'G') {
                green++;
            } else if (c == 'Y') {
                yellow++;
            } else if (c == 'B') {
                blue++;
            }
            int diffRG = Math.abs(red - green);
            int diffYB = Math.abs(yellow - blue);

            if (diffRG > 1 || diffYB > 1) {
                return false;
            }
        }

        boolean condition1 = red == green;
        boolean condition2 = yellow == blue;
        return condition1 && condition2;
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/Color/Input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            String sequence = br.readLine();
            strArr[i] = sequence;
        }

        for (String str : strArr) {
            boolean check = checkColor(str);
            System.out.println(check);
        }
    }
}

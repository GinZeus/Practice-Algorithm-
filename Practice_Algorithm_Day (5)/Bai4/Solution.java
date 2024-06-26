/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day5.LamdaExpression;

/**
 *
 * @author datng
 */
import java.io.*;
import java.util.*;

interface PerformOperation {

    boolean check(int a);
}

class MyMath {

    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return (n) -> {
            return n % 2 != 0;
        };
    }

    PerformOperation isPrime() {
        return (n) -> {
            if (n < 2) {
                return false;
            } else {
                for (int i = 2; i < Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    PerformOperation isPalindrome() {
        return (n) -> {
            String numStr = Integer.toString(n);
            String reverse = "";
            for (int i = 0; i < numStr.length(); i++) {
                reverse = numStr.charAt(i) + reverse;
            }
            return numStr.equals(reverse);
        };
    }
}

// Write your code here
public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

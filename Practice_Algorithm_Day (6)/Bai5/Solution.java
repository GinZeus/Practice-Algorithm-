/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day6.SimpleTextEditor;

/**
 *
 * @author datng
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<String> st = new Stack<>();
        sc.nextLine();
        String s = "";

        for (int i = 0; i < n; i++) {
            String sr = sc.nextLine();
            String[] str = sr.split(" ");
            String op = str[0];
            switch (op) {
                case "1": {
                    s += str[1];
                    st.push(s);
                    break;
                }
                case "2": {
                    int k = Integer.parseInt(str[1]);
                    String p = st.peek();
                    s = p.substring(0, p.length() - k);
                    st.push(s);
                    break;
                }
                case "3": {
                    int k = Integer.parseInt(str[1]);
                    String p = st.peek();
                    System.out.println(p.charAt(k - 1));
                    break;
                }
                case "4": {
                    st.pop();
                    if (!st.empty()) {
                        s = st.peek();
                    } else {
                        s = "";
                    }
                    break;
                }
            }
        }
    }
}

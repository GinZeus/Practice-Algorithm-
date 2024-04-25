/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day9.Map;

/**
 *
 * @author datng
 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBookMap = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();
        //add elements in phoneBookMap
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBookMap.put(name, phone);
            in.nextLine();
        }
        //get numbers from phoneBookMap
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBookMap.containsKey(s)) {
                System.out.println(s + "=" + phoneBookMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

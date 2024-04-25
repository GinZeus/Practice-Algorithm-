/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day7.DefanginIP;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = defangIPaddr(s);
        System.out.println(result);
    }
}

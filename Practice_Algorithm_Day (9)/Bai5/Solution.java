/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day9.HashMap;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author datng
 */
class MyHashMap {
    int[] data;
    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    public void put(int key, int val) {
        data[key] = val;
    }
    public int get(int key) {
        return data[key];
    }
    public void remove(int key) {
        data[key] = -1;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyHashMap map = new MyHashMap();
        int n = sc.nextInt();
        
        for (int i=0; i< n; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key, value);
        }
        System.out.println(map.get(3));
        map.remove(3);
        System.out.println(map.get(3));
    }
}

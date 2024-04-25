/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperDigit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author datng
 */
public class Solution {
    
    public static int caculateDigit (int n, int k){
        if (n/10==0){
            return n;
        } else {
            int sum =0;
            while (n>0){
                sum += n%10;
                n=n/10;
            }
            n=sum*k;
            return caculateDigit(n, 1);
        }
        
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Input
        System.setIn(new FileInputStream("src/SuperDigit/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n=Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int result = caculateDigit(n, k);
        System.out.println(result);
        
    }
    
}

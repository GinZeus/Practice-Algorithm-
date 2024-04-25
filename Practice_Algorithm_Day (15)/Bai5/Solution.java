/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day15.MaxGenerateArray;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static int getMaximumGenerated(int n) {
        int result[]=new int[n+1];
        if(n==0)return 0;
        if(n==1)return 1;
        result[0]=0;
        result[1]=1;
        int max=0;
        for(int i=2;i<n+1;i++){
            if(i%2==0){
                result[i]=result[i/2];
            }
            else{
                result[i]=result[i/2+1]+result[i/2];
            }
            max=Math.max(result[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = getMaximumGenerated(n);
        System.out.println(result);
    }
}

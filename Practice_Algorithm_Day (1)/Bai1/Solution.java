/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Curve;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/**
 *
 * @author datng
 */
public class Solution {
    static BufferedReader br;
    static StringTokenizer st;
    
    //y=f(x)
    public static double f(int[] A, int[] B,double x){
        double y=0;
        for (int i=0;i<A.length;i++){
            y += A[i] * Math.pow(x, B[i]);
        }
        return y;
    }
    
    public static double caculateArea (int[] A, int[] B,int L, int R){
        double S=0;
        double h = 0.001; 
        
        for(double x =L; x<R; x+=h){
            double y = f(A,B,x);
            S +=y*h;
        }
        return S;
    }
    
    public static double caculateVolumn (int[] A, int[] B,int L, int R){
        double V=0;
        double h = 0.001; 
        
        for(double x =L; x<R; x+=h){
            double y = f(A,B,x);
            V += y * y * Math.PI * h;
        }
        return V;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Input
        System.setIn(new FileInputStream("src/Curve/input.txt"));
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int T= Integer.parseInt(br.readLine());
        
        for (int test_case = 1; test_case <= T; test_case++){
            st = new StringTokenizer(br.readLine()," ");
            int N=Integer.parseInt(st.nextToken());
            int L=Integer.parseInt(st.nextToken());
            int R=Integer.parseInt(st.nextToken());
            
            int A[] = new int[N];
            int B[] = new int[N];
            
            st = new StringTokenizer(br.readLine()," ");
            for (int i=0; i<N; i++){
                int a = Integer.parseInt(st.nextToken());
                A[i]=a;
            }
            
            st = new StringTokenizer(br.readLine()," ");
            for (int i=0; i<N; i++){
                int b = Integer.parseInt(st.nextToken());
                B[i]=b;
            }
            DecimalFormat decimalFormat = new DecimalFormat(".#");
            
            double S = caculateArea(A, B, L, R);
            System.out.println(decimalFormat.format(S));
            
            double V = caculateVolumn(A, B, L, R);
            System.out.println(decimalFormat.format(V));
        }
        
    }
}

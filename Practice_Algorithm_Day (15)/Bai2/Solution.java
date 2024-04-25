/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day15.FloodFill;

import java.util.Scanner;

/**
 *
 * @author datng
 */
public class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc]!=color){
            dfs(image,sr,sc,color,image[sr][sc]);
        }
        return image;
        
    }
    public static void dfs(int[][] image, int sr, int sc, int color, int originColor){
        if (sr < 0 || sr>=image.length || sc < 0 || sc>=image[0].length || image[sr][sc] != originColor){
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr-1, sc, color, originColor);
        dfs(image, sr+1, sc, color, originColor);
        dfs(image, sr, sc-1, color, originColor);
        dfs(image, sr, sc+1, color, originColor);
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int row=sca.nextInt();
        int col=sca.nextInt();
        int[][] image = new int[row][col];
        for (int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                image[i][j] = sca.nextInt();
            }
        }
        int sr=sca.nextInt();
        int sc=sca.nextInt();
        int color = sca.nextInt();
        int[][] result = floodFill(image, sr, sc, color);
        for (int i=0;i<result.length;i++){
            for(int j =0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}

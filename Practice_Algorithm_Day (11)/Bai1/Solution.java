/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day11.SherlockAnagram;

/**
 *
 * @author datng
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
        int count =0;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                char[] charArr = sub.toCharArray();
                Arrays.sort(charArr);
                String sortSub = new String(charArr);
                if (!map.containsKey(sortSub)){
                    map.put(sortSub, 1);
                } else {
                    map.put(sortSub, map.get(sortSub)+1);
                }
            }
        }
        
        for (int value:map.values()){
            count += value*(value-1)/2;
        }
            
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));       

        int q = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

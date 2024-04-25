/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day11.Waiter;

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
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        List<Integer> primeNums = getPrimeNumber(q);
        
        for (int i = 0; i < primeNums.size(); i++) {
            if (i == 0) {
                for (int j = number.size() - 1; j >= 0; j--) {
                    if (number.get(j) % primeNums.get(i) == 0) {
                        stackB.add(number.get(j));
                    } else {
                        stackA.add(number.get(j));
                    }
                }
            } else {
                Stack<Integer> temp = new Stack<>();
                while (!stackA.isEmpty()){
                    if (stackA.peek()%primeNums.get(i)==0){
                        stackB.push(stackA.pop());
                    } else {
                        temp.push(stackA.pop());
                    }
                }
                stackA=temp;
            }
            while (!stackB.isEmpty()){
                result.add(stackB.pop());
            }
        }
        while (!stackA.isEmpty()){
            result.add(stackA.pop());
        }
        return result;
    }

    public static List<Integer> getPrimeNumber(int q) {
        ArrayList<Integer> primeNums = new ArrayList<>();
        int count = 0;
        int num = 2;
        while (count < q) {
            if (isPrime(num)) {
                primeNums.add(num);
                count++;
            }
            num++;
        }
        return primeNums;
    }

    public static boolean isPrime(int num) {
        if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.waiter(number, q);
        System.out.println(result);
        bufferedReader.close();
    }
}

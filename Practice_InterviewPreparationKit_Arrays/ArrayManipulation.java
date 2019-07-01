/*

HackerRank --
Practice > Interview Preparation Kit > Arrays ---> Array Manipulation

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

    	// initialize array of values to 0
    	int[] arr = new int[queries.length][n];
    	//Arrays.fill(arr, 0);
		for(int i = 0; i < n; i++) arr[i] = 0;
    	

    	int maxvalue = 0;
	    for(int q = 0; q < queries.length; q++) {	
	    	for(int i = queries[q][0] - 1; i < queries[q][1]; i++) {
	    		arr[i] += queries[q][2];
	    		if (arr[i] > maxvalue) {
	    			maxvalue = arr[i];
	    		}
	    	} // end sum run
	    } // end loop runs

	    System.out.println(maxvalue);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

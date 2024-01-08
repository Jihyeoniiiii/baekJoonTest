package prac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Array_1 {
	public static void main(Str_prac[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int max = 0;
		float result = 0;
		float sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i]>max)
				max = arr[i];
		}
		
		for (int i = 0; i < n; i++) {
		    result = ((float) arr[i] / max) * 100;
		    sum += result;
		}
		
		System.out.println(sum/n);
		
	}
}
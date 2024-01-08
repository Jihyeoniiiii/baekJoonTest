package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_2_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[5][15];
		StringBuilder result = new StringBuilder();
		int m = 0;
		
		for(int i=0; i<5; i++) {
			StringBuilder sb = new StringBuilder(br.readLine());
			m = sb.length();
			for(int j=0; j<m; j++) {
				arr[i][j] = sb.charAt(j);
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<5; j++) {
				char c = arr[j][i];
				if(c!=0) {
					result.append(arr[j][i]);
				}
				else continue;
			}
		}
		System.out.println(result);
	}
}
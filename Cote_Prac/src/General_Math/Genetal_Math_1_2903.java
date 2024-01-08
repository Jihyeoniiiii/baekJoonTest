package General_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Genetal_Math_1_2903 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dot = 2;
		
		//Math.pow(거듭제곱할 숫자, 거듭제곱)
		//System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));
		
		for(int i=0; i<n; i++) {
			dot += (dot-1);
		}
		System.out.println(dot * dot);
	}
}

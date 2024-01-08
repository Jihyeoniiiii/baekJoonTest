package General_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Genetal_Math_1_2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int q = 25;
		int d = 10;
		int n = 5;
		int p =1;
		
		for(int i=0; i<num; i++) {
			int r = Integer.parseInt(br.readLine());
			sb.append(r/q+" ");
			r%=q;
			sb.append(r/d+" ");
			r%=d;
			sb.append(r/n+" ");
			r%=n;
			sb.append(r/p+"\n");
		}
		System.out.println(sb);
	}
}

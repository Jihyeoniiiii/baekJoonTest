package General_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class General_Math_1_11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		while(n>0) {
			if(n%b >= 10) sb.append((char) ((n%b)+'A'-10));
			else sb.append(n%b);
			n/=b;
		}
		System.out.println(sb.reverse().toString());
	}
}

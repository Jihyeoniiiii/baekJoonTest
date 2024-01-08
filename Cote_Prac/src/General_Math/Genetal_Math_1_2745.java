package General_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Genetal_Math_1_2745 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
		int sum = 0;
		int temp = 1;
		
		for(int i=n.length()-1; i>=0; i--) {
			char c = n.charAt(i);
			if('A'<= c && c <='Z') {
				sum += ((c-'A'+10)*temp);
			}
			else {
				sum += ((c-'0')*temp);
			}
			temp *= b;
		}
		System.out.println(sum);
	}
}
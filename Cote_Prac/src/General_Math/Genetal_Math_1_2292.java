package General_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Genetal_Math_1_2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int addr = 1;
		int count = 1;
		
		//6개씩 주소가 늘어남
		while(n!=1) {
			addr += 6*count;
			count++;
			if(addr>n) {
				break;
			}
		}
		System.out.println(count);
	}
}
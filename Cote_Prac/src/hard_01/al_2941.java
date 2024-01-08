package hard_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class al_2941 {
	public static void main(String[] args) throws IOException {
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(String alpha: arr) {
			if(s.contains(alpha))
				s = s.replaceAll(alpha, " ");
		}
		System.out.println(s.length());
	}
}
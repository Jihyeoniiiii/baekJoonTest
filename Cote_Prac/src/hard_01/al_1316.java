package hard_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws  IOException {
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i<n; i++) {
			if(isGroupString()) count++;
		}
		System.out.println(count);
	}
	public static boolean isGroupString() throws IOException {
		boolean[] alphabetArr = new boolean[26];
		int preChar = 0;
		String s = br.readLine();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c!=preChar) {
				if(!alphabetArr[c-'a']){
					alphabetArr[c-'a'] = true;
					preChar = c;
				}
				else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}
}

package hard_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class al_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.toUpperCase();
		Map<Character,Integer> map = new HashMap<>();
		List<Character> list = new ArrayList<>();
		int max = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			max = Math.max(max, map.get(c));
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue() == max)
				list.add(entry.getKey());
		}
		
		if(list.size()>1) {
			System.out.println("?");
		} else {
			System.out.println(list.get(0));
		}
	}
}

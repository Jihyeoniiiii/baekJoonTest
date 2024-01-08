package hard_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class al_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float creditSum = 0;
		float majorSum = 0;
		float checkCredit = 0;
		
		for(int i=0; i<20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			float credit = Float.parseFloat(st.nextToken());
			creditSum += credit;
			String grade = st.nextToken();
			majorSum += isMajorScore(credit,grade);
			checkCredit = isMajorScore(credit,grade);
			if(checkCredit == 0) {
				creditSum -= credit;
			}
		}
		System.out.format("%.6f", majorSum/creditSum);
	}
	
	public static float isMajorScore(float credit, String grade) {
		float gradeNum = 0;
		switch(grade) {
		case "A+":
			gradeNum = (float) 4.5;
			break;
		case "A0":
			gradeNum = (float) 4.0;
			break;
		case "B+":
			gradeNum = (float) 3.5;
			break;
		case "B0":
			gradeNum = (float) 3.0;
			break;
		case "C+":
			gradeNum = (float) 2.5;
			break;
		case "C0":
			gradeNum = (float) 2.0;
			break;
		case "D+":
			gradeNum = (float) 1.5;
			break;
		case "D0":
			gradeNum = (float) 1.0;
			break;
		case "F":
			gradeNum = (float) 0.0;
			break;
		case "P":
			gradeNum = (float) 5.0;
			break;
		}
		if(gradeNum == 5.0) {
			credit = 0;
		}
		return gradeNum*credit;
	}
}

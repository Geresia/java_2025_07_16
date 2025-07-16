package mymain;

import myutil.MyLine;

public class MyMain_Line {
	
	/*
	 * 메소드 호출 방법에 따른 분류
	 * 1. Call By Name
	 * 2. Call By Value
	 * 3. Call By Reference
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%20s\n","[성적관리]");
		
		int line_length = 41;
		
		//System.out.println("---------------------------------");
		MyLine.drawLine('=',line_length);
		System.out.println(" 번호 이름   국어 영어 수학 총점 평균");
		System.out.println(" 1    홍길동  99   88   77  277  89");
		System.out.println(" 2    이길동  91   28   47  269  89");
		System.out.println(" 3    삼길동  90   68   57  255  89");
//		System.out.println("---------------------------------");
		MyLine.drawLine('*','-',line_length, line_length, line_length);
		System.out.println("소계          277  287  269 ");
//		System.out.println("---------------------------------");
		MyLine.drawLine(line_length);
		MyLine.drawLine('*','-', 1, 2, line_length);
		MyLine.drawLine('*','-', 2, 2, line_length);
		MyLine.drawLine('*','-', 1, 1, line_length);
		
		// 패턴
		// *--*--*--*--*--*--*--*--*--*--*
		// **--**--**--**--**--**--**--**
		// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*
	}

}

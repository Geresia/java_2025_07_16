package myutil;

public class MyLine {
	//Call by Name (이름을 통해 호출)
	public static void drawLine() {
		System.out.println("──────────────────────────");
		return;
	}
	/*2개 메소드 관계
	Method Overload(중복 메소드)
	메소드명은 동일하나 호출인자정보가 다른 메소드
	유리한 점 : 사용자가 별도의 이름을 기억하지 않아도 돼서 사용하기 편함.
	*/
	
	//Call by Value (값을 통해 호출)
	public static void drawLine(int lng) {
		for(int i = 0; i<lng; i++) {
			System.out.print("─");
		}//end:for
		System.out.println();//줄바꾸기
		return;	
	}	

	public static void drawLine(char pattern1, char pattern2,
			int ptLng1, int ptLng2, int lng) {
	//Myline.drawline '*',1,'-',2,10);
		
			for(int i = 0; i<lng; i++) {
				if(ptLng1 >= 1){		
					for(int k = 0; k<ptLng1; k++)
					System.out.print(pattern1);
				}
				if(ptLng2 >= 1) {
					for(int j = 0; j<ptLng2; j++)
				System.out.print(pattern2);
				}
			}//end:for
			if(ptLng1 >= 1){		
				for(int k = 0; k<ptLng1; k++)
				System.out.print(pattern1);
			}
			System.out.println();//줄바꾸기
			return;		
	}//end : pattern
	
	public static void drawLine(String word, int lng) {
		for(int i = 0; i<lng; i++) {
			System.out.print(word);
			if(word=="") System.out.print("─");
		}//end:for
		System.out.println();//줄바꾸기
		return;		
	}
}

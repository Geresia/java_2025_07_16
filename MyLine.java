package myutil;

public class MyLine {

    // 기본 선 그리기
    public static void drawLine() {
        System.out.println("--------------------------------------");
    }

    // 길이만 지정해서 '-' 문자로 그리기
    public static void drawLine(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    // 지정한 문자로 길이만큼 그리기
    public static void drawLine(char pattern, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(pattern);
        }
        System.out.println();
    }

    // 두 가지 문자와 각 길이를 조합해서 그리기('*',1,'-',2,10)
//      										  *--*--*--*
    public static void drawLine(char pattern1,char pattern2, int len1, int len2, int len_total) {
    	
    	int blockSize = len1 + len2;
        for (int i = 0; i < len_total; i++) {
            int posInBlock = i % blockSize;
            if (posInBlock < len1) {
                System.out.print(pattern1);
            } else {
                System.out.print(pattern2);
            }
        }
        System.out.println();
  
    }

}
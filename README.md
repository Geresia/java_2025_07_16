## MyLine 유틸리티 클래스

`MyLine` 클래스는 콘솔에 다양한 스타일의 구분선을 간편하게 출력할 수 있는 유틸리티입니다.  
다음과 같이 4가지 오버로드된 `drawLine` 메소드를 제공합니다.

### 1. 기본 구분선 그리기
```java
// 길이 38의 '-' 선 출력
MyLine.drawLine();

2. 지정 길이의 '-' 구분선
// 길이 10의 '-' 선 출력
MyLine.drawLine(10);
3. 지정 문자로 구분선
// 길이 5의 '*' 선 출력
MyLine.drawLine('*', 5);
4. 두 가지 문자·길이 블록 패턴 구분선
// '*' 1글자, '-' 2글자를 하나의 블록으로 하여 총 10글자 출력
MyLine.drawLine('*', '-', 1, 2, 10);
// 출력: *--*--*--*
메소드 시그니처
public static void drawLine(
    char p1,        // 첫 번째 문자
    char p2,        // 두 번째 문자
    int len1,       // p1을 연속으로 출력할 개수
    int len2,       // p2를 연속으로 출력할 개수
    int lenTotal    // 전체 출력할 문자 수
)
동작 원리
블록 크기 계산
blockSize = len1 + len2

인덱스 기반 패턴 선택

루프 변수 i를 blockSize로 나눈 나머지(i % blockSize)가

< len1 이면 p1

>= len1 이면 p2 출력

총 lenTotal만큼 반복

이로써 *--*--*--*처럼 지정한 블록 패턴을 쉽게 출력할 수 있습니다.

사용 예시
public class Example {
    public static void main(String[] args) {
        // 1) 기본 선
        MyLine.drawLine();

        // 2) 길이 지정
        MyLine.drawLine(20);

        // 3) 문자 지정
        MyLine.drawLine('#', 10);

        // 4) 블록 패턴
        MyLine.drawLine('*', '-', 2, 3, 25);
    }
}

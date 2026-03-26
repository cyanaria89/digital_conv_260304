package 기본_시스템출력;

/*
  자바 표준 입출력 클래스 : 사용자와 프로그램 사이의 입출력을 담당
  입력과 출력은 무수히 많은 장치가 있을 수 있음
  System.in : 표준 입력 스트림, 사용자의 입력을 프로그램으로 넣는 것
  System.out : 표준 출력 스트림, 프로그램의 출력을 콜솔로 나타내는 것, 버퍼 O
  System.err : 표준 오류 스트림, 프로그램 내에서 발생한 오류를 콘솔에 출력 할 때 사용, 버퍼 X
               속도는 빠르지만 리다이렉션이 안됨, 잘 안씀
  sl4fj - log 출력 라이브러리?
*/

public class SystemOut {
    public static void main(String[] args) {
        /* 표준 출력 : println(내용) - 줄 바꿈 포함
                     print(내용) - 줄 바꿈 없음
                     printf("서식", 출력값) - 서식 지정자 사용 */
        // 이름: 문자열, 주소: 문자열, 성별: 문자, 국어/영어/수학: 정수, 총점: 정수, 평균: 실수(형 변환 필요)
        String name = "Hong Jun Hee";
        String addr = "충남 천안시 동남구";
        char gender = '남';
        int kor = 93, eng = 62, mat = 72;
        int total = (kor + eng + mat);
        double avg = total / 3.0;

        // 이스케이프 시퀀스 : 화면 출력 제어를 하기 위해 사용 (\n, \r, \t, \b, \\)
        // \n : (new line) 줄 바꿈
        System.out.println("안녕하시오~\n"); // 기본적으로 \n(줄 바꿈)이 포함되어 있음
        System.out.println(name + " 님");
        // \r : (Carriage Return) 커서 맨 앞으로
        System.out.println("바나나\r사과\r포도");
        // \t : (tap) tap size 만큼 간격 띄움
        System.out.println("banana\tapple\tgrape");
        // \b : (backspace) 앞 글자 하나 지움
        System.out.println(addr + "\b");
        // \\ : '\'를 출력하기 위함
        System.out.println("\\");

        // 서식지정자 사용 : printf()
        // 문자열 출력 서식은 %s (string), 변수를 서식에 대입해서 출력
        System.out.printf("이름 : %s\n", name);
        System.out.printf("주소 : %s\n", addr);
        // 문자 출력 서식은 %c (char)
        System.out.printf("성별 : %c\n", gender);
        // 정수 %d (decimal? digit?)
        System.out.printf("총점 : %d\n", total);
        // 실수 %f (%.2f: 소수점 3번째 자리를 반올림 해서 소수점 2번째 자리까지 표시) (floating point)
        System.out.printf("평균 : %.2f\n", avg);

        // println(), print() : 오버로딩 - 동일 이름의 메서드를 매개변수의 개수나 타입으로 호출할 메서드를 결정
        System.out.println("이름 : " + name); // 문자열 출력에 대한 메서드 호출
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender); // 문자열 + 문자 > 문자열 출력 (String)
        System.out.println(gender); // 문자 출력 (char)
        System.out.println(gender == '남' ? "1******":"2******"); // 3항 연산자
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);

        System.out.println("JDK" + 17 + 8); // JDK178 출력, 모두 문자열로 간주
        System.out.println("JDK" + (17 + 8)); // JDK25 출력
        System.out.println(17 + 8 + "JDK"); // 25JDK 출력, 좌측부터 순서대로 연산

    }
}

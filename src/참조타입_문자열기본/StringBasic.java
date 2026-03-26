package 참조타입_문자열기본;

// 자바의 문자열은 참조 타입의 자료형
// 객체를 만들어 사용 or 리터럴 표기 방식으로 사용 - 리터럴 표기 방식이 유리

public class StringBasic {
    public static void main(String[] args) {
        String name1 = "aespa";  // 리터럴 표기 방식
        String name2 = new String("aespa");  // 안쓰이는 방식

        // equals() : 두 개의 문자열을 비교하여 결과 값을 리턴 - true / false
        // overwritting 되어 있음
        System.out.println(name1.equals(name2));            // true
        System.out.println(name1 == name2);                 // 주소 값을 비교 - false

        String text1 = "Spring";
        String text2 = "spring";
        System.out.println(text1.equals(text2));            // false
        System.out.println(text1.equalsIgnoreCase(text2));  // 대소문자 구분 X - true

        // indexOf() : 문자열에서 특정 문자열의 시작 인덱스를 반환
        String text3 = "Java Programming Cool";
        System.out.println(text3.indexOf("Pro"));           // "Pro"가 시작되는 위치의 인덱스 / 5
        System.out.println(text3.indexOf("Prok"));          // 해당하는 단어가 없으므로 / -1
        System.out.println(text3.indexOf(" "));          //

        // contains() : 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴 (true / false)
        System.out.println(text3.contains("Java"));         // true
        System.out.println(text3.contains("Python"));       // false

        // charAt(인덱스) : 문자열에서 특정 위치의 문자를 리턴
        System.out.println(text3.charAt(3));                // v

        // replace("old", "new") : 문자열 중 "old" 문자열을 "new" 문자열로 대체
        System.out.println(text3.replace("Java", "C++"));
        System.out.println(text3.replace(" ", ""));
        // replaceAll() : 정규 표현식(JS때 배울 예정)을 넣을 수 있음

        // substring() : 문자열에서 특정 문자열을 추출 할 때 사용
        System.out.println(text3.substring(5));    // 5번 인덱스 부터 끝까지
        System.out.println(text3.substring(5, 10));         // 5번 부터 10번 미만 까지

        // toUpperCase(), toLowerCase() : 문자열을 전부 대문자 / 소문자로 변경
        System.out.println(text3.toUpperCase());
        System.out.println(text3.toLowerCase());

        // trim() : 문자열의 앞/뒤 공백 잘라냄
        String text4 = "  Java Programming is hard  ";
        System.out.println(text4.trim());
        System.out.println(text4);

        // split() : 문자열을 특정 문자열로 구분
        String time = "10:32:40";
        String[] timeArray = time.split(":");   // ':' 기준으로 여러 개의 문자열로 나누어서 배열에 저장
        System.out.printf("%s시 %s분 %s초", timeArray[0], timeArray[1], timeArray[2]);

        System.out.println();

        // 문자열 포메팅 : 문자열 내에서 특정 값을 삽입하는 방법 - printf()와 유사
        int num = 28;
        String testFormat = String.format("그냥 %d 써봤음", num);
        System.out.println(testFormat);

        // toCharArray() : 문자열을 문자 배열로 변환
        String text5 = "Java C++ Python";
        char[] text5Arr = text5.toCharArray();       // 하나의 문자열을 문자 배열로 변환
        for (char e : text5Arr) {
            System.out.print(e + " ");
        }
    }
}

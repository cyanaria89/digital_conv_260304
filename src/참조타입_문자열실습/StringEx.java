package 참조타입_문자열실습;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
//        StringEx1();
//        StringEx2();
        StringEx3();
    }

    static void StringEx1() {
        /*  1번 : 입력 문자열에 대해 대/소문자 변경
            ex) AbCdEfG => aBcDeFg
            문자 추출 - 대/소문자 확인 - 변환    */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자 입력 : ");
        String str = sc.nextLine();
        String rst = "";
        char[] ch = str.toCharArray();
        char[] chLower = str.toLowerCase().toCharArray();
        char[] chUpper = str.toUpperCase().toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == chLower[i]) { rst += chUpper[i]; }
            else { rst += chLower[i]; }
        }
        System.out.println("입력 문자열 : " + str);
        System.out.println("출력 문자열 : " + rst);
    }

    static void StringEx2() {
    /*  2번 : 문자열 추가
        hint : length, substring
        2개의 문자열 s, k, 정수 n을 입력 받아
        s 문자열 뒤 부분의 n개의 문자를 k 문자열 앞에 붙여넣는 코드 작성
        ex) 입력 : s = "seoul", k = "korea", n = 2
            결과 : ulkorea    */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열1 : ");
        String s = sc.nextLine();
        System.out.print("문자열2 : ");
        String k = sc.nextLine();
        System.out.print("정수 n : ");
        int n = sc.nextInt(); sc.nextLine();

        String rst = s.substring(s.length() - n) + k;
        System.out.println(rst);
    }

    static void StringEx3() {
    /*  3번 : 알고리즘 문제 풀이 > 3단계 중급문제 > KMP
        대문자만 골라내서 출력
        입력은 한 줄, 최대 100글자의 대문자, 소문자, '-'
        첫 번째 글자는 항상 대문자, '-' 뒤에는 반드시 대문자, 그 외는 모두 소문자

        hint
        첫 번째 문자 출력 이후 '-' 찾아서 그 다음에 오는 문자 출력
        또는 split 사용, 문자열 분리 후 첫 문자 출력
        또는 문자열을 문자 배열로 전환 후 ASCII 코드 값으로 추출     */

        Scanner sc = new Scanner(System.in);
        System.out.print("Algorithm Name : ");
        String lName = sc.nextLine();

/*        // 1
        String[] nSplit = lName.split("-");
        String rst = "";
        for (int i = 0; i < nSplit.length; i++) {
            rst += nSplit[i].charAt(0);
        }
*/
/*        // 2
        StringBuilder rst = new StringBuilder();
        rst.append(lName.charAt(0));
        for (int i = 1; i < lName.length(); i++) {
            if (lName.charAt(i) == '-') rst.append(lName.charAt(i + 1));
        }
*/
        // 3
        String rst = "";
        for (int i = 0; i < lName.length(); i++) {
            if (lName.charAt(i) >= 'A' && lName.charAt(i) <= 'Z') {
                rst += lName.charAt(i);
            }
        }

        System.out.println("abbreviation : " + rst);
        // StringBuilder, str.append(''); 안써도 일단은 가능
    }
}

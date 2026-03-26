package 참조타입_문자열실습;

import java.util.Scanner;

public class StringExAnswer {
    public static void main(String[] args) {
        // 1번
//        stringLowupperChange();

        // 2번
//        stringAdd();

        // 3번
//        kmpUpper();
//        hyphenNext();
//        splitHyphen();
        charArr();
    }

    // 1번
    static void stringLowupperChange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

/*        // 1번 풀이
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                System.out.print((char) (str.charAt(i) - ('a' - 'A')));
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                System.out.print((char) (str.charAt(i) + ('a' - 'A')));
            } else {
                System.out.print(str.charAt(i));
            }
        }
*/
        // 2번 풀이
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                System.out.print(Character.isUpperCase(c));
            } else {
                System.out.print(c);
            }
        }
    }

    // 2번
    static void stringAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("s 문자열 입력 : ");
        String s = sc.nextLine();
        System.out.print("k 문자열 입력 : ");
        String k = sc.nextLine();
        System.out.print("정수 n 입력 : ");
        int n = sc.nextInt(); sc.nextLine();

        int pos = s.length() - n;   // 문자열 길이 - 입력한 정수
        System.out.println(s.substring(pos) + k);
    }

    // 3번 - 풀이 1
    // 대문자만 골라내기
    static void kmpUpper() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);     // 문자열에서 해당 인덱스의 문자 추출
            if (Character.isUpperCase(c)) System.out.print(c);
        }
    }

    // 3번 - 풀이 2
    // 하이픈 다음 문자 추출
    // 첫 번째 문자 출력 후, 하이픈 다음 문자 출력
    static void hyphenNext() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) System.out.print(str.charAt(i));
            else {
                if (str.charAt(i) == '-') System.out.print(str.charAt(i + 1));
            }
        }
    }

    // 3번 - 풀이 3
    // 하이픈 기준으로 자르기
    static void splitHyphen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        String[] arr = str.split("-");  // 문자열을 하이픈 기준으로 잘라서 부분 문자열로 이루어진 배열 생성
        for (String s : arr) {
            System.out.print(s.charAt(0));  // 하이픈 기준으로 자른 문자열의 0번 인덱스 출력
        }
    }

    // 3번 - 풀이 4
    // 문자 배열로 변환
    static void charArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        char[] chArr = str.toCharArray();   // 문자열을 문자 배열로 변환
        for (char c : chArr) {
            if (Character.isUpperCase(c)) System.out.print(c);
        }
    }
}

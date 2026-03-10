package 문자열실습;

import java.util.Scanner;

public class StringExAnswer {
    public static void main(String[] args) {
        StringLowupperChange();
    }

    static void StringLowupperChange() {
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

    static void stringAdd() {

    }

//    static void
}

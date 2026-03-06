package For문;

// for(초기값; 최종값; 증감값) { 실행내용 }

import java.util.Scanner;

public class ForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

     /* for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int j = 0; // 초기값
        for (;;) {
            System.out.print("- ");
            j++; // 증감깂
            if (j == num) break; // 최종값
        } // 사실상 while (true) {} 와 동일
        System.out.println();             */

        // 정수값을 입력 받음
        // 입력 받은 정수값 범위의 5의 배수를 1줄에 10개씩 출력
//        int cnt = 0;
//        for (int i = 1; i <= num; i++) { // for (int i = 1; i <= num; i += 5)
//            if ((i % 5) == 0) {
//                System.out.printf("%03d ", i); // System.out.printf("%4d", i);
//                cnt++;
//                if ((cnt % 10) == 0) System.out.println();
//            }
//            // if (cnt == 10) { System.out.println(); cnt = 0; }
//        }

        // 정수 num을 입력 받아 num * num 출력
        int cnt = 0;
        for (int i = 1; i <= (num*num); i++) {
            System.out.printf("%"+((((num*num)+"").length())+1)+"d", i);
            cnt++;
            if ((cnt % num) == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // 문자열을 입력받아 역순으로 출력하기
        // "ABCDEFG" => "GFEDCBA"
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        sc.nextLine();
        for (int i = str.length() ; i > 0 ; i--) {
            System.out.print(str.charAt(i-1)); // index는 0부터 시작
        }
        System.out.println();
    }
}

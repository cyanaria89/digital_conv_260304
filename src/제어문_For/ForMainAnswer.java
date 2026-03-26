package 제어문_For;

import java.util.Scanner;

public class ForMainAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= num * num; i++) {
            System.out.printf("%4d", i);
            if (i % num == 0) System.out.println();
        }

        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        String rst = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rst += str.charAt(i);
        }
        System.out.println(rst);
    }
}

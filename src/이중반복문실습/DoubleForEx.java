package 이중반복문실습;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class DoubleForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력! : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print((j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }
}

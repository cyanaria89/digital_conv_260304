package 이중반복문;

// 2중 for문은 반복문 내에 반복문이 존재하는 것 (가끔 사용)
// BIG-O 표기법 : 시간 복잡도를 나타낼 때 사용?
// 시간적으로 별로 효율적이진 않음?

import java.util.Scanner;

public class DoubleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드로 입력받기 위해 스캐너 객체 생성
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();

        // 입력 받은 정수 * 정수 만큼의 별 찍기 (square)
        for (int i = 0; i < num; i++) { // 행
            System.out.printf("|i=%2d| ", i); // i 값의 변화 확인
            for (int j = 0; j < num; j++) {
                System.out.print("* ");
//                System.out.print((i % 2 == 0) ? (j % 2 == 0 ? "* " : "  ") : (j % 2 == 0 ? "  " : "* "));
            }
            System.out.println(); // 한 줄 찍고 줄바꿈
        }

        System.out.println();

        // 구구단 출력 : 단(2 ~ 9) * (1 ~ 9)
        System.out.println("-".repeat(22));
        for (int i = 2; i <= 9; i++) {
            System.out.printf("\t\t[ %d단 ]\n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("\t%2d x %2d = %2d\n", i, j, i * j);
            }
            System.out.println("-".repeat(22));
        }

    }
}

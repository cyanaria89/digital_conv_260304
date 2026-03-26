package Lambda.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class JavaCodeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseCnt = sc.nextInt();
        sc.nextLine();
        double[] rate = new double[caseCnt];

        for (int i = 0; i < caseCnt;) {
            int studentCnt = sc.nextInt();
            if (studentCnt >= 1 && studentCnt <= 1000) {
                int[] score = new int[studentCnt];
                for (int j = 0; j < studentCnt; j++) {
                    int s = sc.nextInt();
                    if (s >= 0 && s <= 100) {
                        score[j] = s;
                    } else {
                        System.out.println("입력오류. 종료합니다.");
                        return;
                    }
                }
                rate[i] = rateCalc(score);
                i++;
            } else {
                System.out.println("학생 수는 1 ~ 1000 사이의 정수를 입력");
            }
        }

        for (double e : rate) {
            System.out.printf("%.3f%%\n", e);
        }
    }

    public static double rateCalc(int[] score) {
        int sum = 0;
        for (int s : score) { sum += s; }

        double avg = (double)sum / score.length;

        int cnt = 0;
        for (int e : score) { if (e > avg) cnt++; }

        return ((double)cnt / score.length) * 100;
    }
}
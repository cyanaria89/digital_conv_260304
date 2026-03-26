package Lambda.Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LambdaCodeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseCnt = sc.nextInt();
        sc.nextLine();
        double[] rate = new double[caseCnt];

        IntStream.range(0, caseCnt).forEach(i -> {
            int studentCnt = sc.nextInt();
            int[] score = IntStream.range(0, studentCnt).map(j -> sc.nextInt()).toArray();
            rate[i] = rateCalc(score);
        });
        Arrays.stream(rate).forEach(e -> System.out.printf("%.3f%%\n", e));
    }

    public static double rateCalc(int[] score) {
        double avg = Arrays.stream(score).average().orElse(0);
        long cnt = Arrays.stream(score).filter(s -> s > avg).count();
        return ((double)cnt / score.length) * 100;
    }
}
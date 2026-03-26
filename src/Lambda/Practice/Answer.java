package Lambda.Practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Answer {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int cnt = sc.nextInt();
        double[] result = new double[cnt];

        IntStream.range(0, cnt).forEach(i -> result[i] = overRate());

        Arrays.stream(result).forEach(e -> System.out.printf("%.3f%%\n", e));
    }

    static double overRate() {
        int studentCnt = sc.nextInt();
        double[] score = new double[studentCnt];

        IntStream.range(0, score.length).forEach(i -> score[i] = sc.nextInt());

        double avg = Arrays.stream(score).average().orElse(0.0);

        int overCnt = (int) Arrays.stream(score).filter(s -> s > avg).count();

        return (double) overCnt / studentCnt * 100;
    }
}
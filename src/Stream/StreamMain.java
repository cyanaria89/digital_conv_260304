package Stream;

import java.util.Arrays;
import java.util.List;
/*
    스트림의 동작 흐름 : 생성 > 중간연산 > 종단연산
*/
public class StreamMain {
    public static void main(String[] args) {
        // 둘 다 결과는 동일 1 ~ 10 정수가 들어있는 배열 생성
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 배열 순회
        for (int e : list1) { System.out.printf("%3d", e); }
        System.out.println();
        // 5 이상 출력
        for (int e : list1) { if (e >= 5) System.out.printf("%3d", e); }
        System.out.println();
        // 짝수 출력
        for (int e : list1) { if (e % 2 == 0) System.out.printf("%3d", e); }
        System.out.println();
        // 5 이상 짝수 출력
        for (int e : list1) { if ((e >= 5) && (e % 2 == 0)) System.out.printf("%3d", e); }
        System.out.println();

        // Stream 순회
        list2.forEach(e -> System.out.printf("%3d", e));
        System.out.println();
        // Stream 5 이상 출력
        list2.stream().filter(e -> e >= 5).forEach(e -> System.out.printf("%3d", e));
        System.out.println();
        // Stream 짝수 출력
        list2.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.printf("%3d", e));
        System.out.println();
        // Stream 5 이상 짝수 출력
        list2.stream().filter(e -> e >= 5 && e % 2 == 0).forEach(e -> System.out.printf("%3d", e));
        System.out.println();

        // list2 에서 짝수 갯수
        int cnt = (int)list2.stream().filter(e -> e % 2 == 0).count();
        System.out.println(cnt);
    }
}

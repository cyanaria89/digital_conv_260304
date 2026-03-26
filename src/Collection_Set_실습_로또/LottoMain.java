package Collection_Set_실습_로또;

import java.util.*;

/*
    1 ~ 45 사이의 임의의 수 6개 생성
    1. ArrayList 사용
    2. 집합 사용
*/
public class LottoMain {
    public static void main(String[] args) {
        lotto1();
        System.out.println();
        lotto2();
    }

    // Set은... 중복 제거... 필요 없는데... > 주석부분 필요없다는 얘기
    private static void lotto2() {
        Set<Integer> lotto2 = new HashSet<>();
//        Set<Integer> lotto3 = new HashSet<>();
        while (lotto2.size() < 6) {
            int rand = (int)((Math.random() * 45) + 1);
            lotto2.add(rand);
//            lotto3.add(rand);
//            lotto2.addAll(lotto3);
        }
        List<Integer> l = new ArrayList<>(lotto2);
        Collections.sort(l);
        System.out.println(l);
    }

    public static void lotto1() {
        List<Integer> lotto1 = new ArrayList<>();

        while (lotto1.size() < 6) {
            int rand = (int)((Math.random() * 45) + 1);
            if (!lotto1.contains(rand)) lotto1.add(rand);
        }
        Collections.sort(lotto1);
        System.out.println(lotto1);
    }
}
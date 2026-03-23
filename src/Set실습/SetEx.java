package Set실습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        // 합집합 : 집합의 모든 요소 포함. 단, 중복은 제거
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        set1.addAll(set2);          // 합집합
        System.out.println(set1);

        // 교집합 : 중복되는 요소만 포함. 역시 중복은 제거
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        set3.retainAll(set4);       // 교집합
        System.out.println(set3);

        // 차집합 : A 집합에서 B 집합과 중복되는 요소를 제거
        Set<Integer> set5 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        set5.removeAll(set6);
        System.out.println(set5);
    }
}

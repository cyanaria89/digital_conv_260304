package 로또번호생성기;

import java.util.*;

public class LottoMainA {
    public static void main(String[] args) {
        // ArrayList - 중복 제거 필요
        List<Integer> lottoAL = new ArrayList<>();

        while (lottoAL.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            if (!lottoAL.contains(num)) {
                lottoAL.add(num);
            }
        }
        Collections.sort(lottoAL);
        System.out.println(lottoAL);

        // Set - Set 자체가 중복을 허용하지 않음
        Set<Integer> lottoSet = new HashSet<>();
        while (lottoSet.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            lottoSet.add(num);
        }
        List<Integer> l = new ArrayList<>(lottoSet);
        Collections.sort(l);
        System.out.println(l);
    }
}

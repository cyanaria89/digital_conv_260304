package 트리맵;

import java.util.Map;
import java.util.TreeMap;
/*
    TreeMap : 이진 검색 트리 기반 Map Collections
    Key는 중복 X, Value는 중복 O
    Key 기준으로 정렬된 자료가 필요할 때 사용
    ex) 성적표, 회원리스트(사전 순서 정렬) 등
*/
public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, String> scoreMap = new TreeMap<>();
        scoreMap.put(87, "나희도");
        scoreMap.put(75, "백이진");
        scoreMap.put(98, "우영우");

        // 오름차순
        for (Map.Entry<Integer, String> entry : scoreMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("----------");

        // 내림차순
        for (Map.Entry<Integer, String> entry : scoreMap.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

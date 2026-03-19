package ArrayList기본;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        // List 인터페이스의 참조 변수에 ArrayList 객체를 대입
        // ArrayList 대신 LinkedList, Vector 를 넣어도 이상없이 동작함
        List<String> list = new ArrayList<>();
        list.add("Elden Ring");
        list.add("Demon's Souls");
        list.add("Blood Borne");
        list.add("Dark Souls");
        list.add("Sekiro");

        for (String s : list) {
            System.out.printf("%s, ", s);
        }
        System.out.println();

        // 리스트 크기
        System.out.println(list.size());

        // 특정 인덱스에 요소 추가
        list.add(4, "Dark Souls 3");

        // 특정 인덱스의 요소 가져오기
        System.out.println(list.get(2));

        // 특정 인덱스 요소 제거하기
        list.remove(3);

        // 값의 포함 여부 확인
        System.out.println(list.contains("Demon's Souls"));

        for (String s : list) {
            System.out.printf("%s,", s);
        }
    }
}

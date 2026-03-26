package Collection_트리셋;

import java.util.Iterator;
import java.util.TreeSet;

/*
    TreeSet : 이진 검색 트리 기반의 Set Collections
    - 요소가 자동으로 정렬됨 (Tree) - 트리 생성 시 조건을 넣어두면 추후 정렬이 따로 필요 없음
    - 중복 허용하지 않음 (Set)
    - 삽입, 삭제, 검색 : O(log n)
    - 중위(Inorder) 순회 시 오름차순 출력 가능
*/
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(10);
        treeSet.add(18);
        treeSet.add(15);
        treeSet.add(7);
        treeSet.add(33);
        treeSet.add(25);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(11);

        for (int e : treeSet) {
            System.out.printf("%d ", e);
        }
        System.out.println();

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = treeSet.iterator();
        while(iter.hasNext()) System.out.print(iter.next() + " ");
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : " + treeSet.size());

        // subSet() 메소드를 이용한 부분 집합의 출력
        System.out.println(treeSet.subSet(10, 30));
    }
}

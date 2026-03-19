package Arrays클래스;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    Arrays 클래스 : 배열을 다루기 위한 다양한 메서드가 포함되어 있음.
                   대체제가 있어 많이 쓰이진 않는다.
*/
public class ArraysMain {
    public static void main(String[] args) {
        int[] arr1 = { 45, 646, 47, 64, 6, 56, 541, 154, 68, 4768, 54, 1356, 8478, 9 };
        Integer[] arr2 = { 45, 646, 47, 64, 6, 56, 541, 154, 68, 4768, 54, 1356, 8478, 9 };
        Arrays.sort(arr1);   // 오름차순 정렬
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 9));   // 인덱스 값 반환

        // Collections 는 참조타입만 사용 가능 -> int[] 에러, Integer[] 가능
        Arrays.sort(arr2, Collections.reverseOrder());   // 내림차순 정렬
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 47, Collections.reverseOrder()));
        // -> 내림차순이므로 추가 키워드?(Collections.reverseOrder()) 필요

        // 정렬 조건 오버라이딩
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) return 1;          // 오름차순
                else if (o1 < o2) return -1;    // 현상 유지
                else return 0;                  // 값 같음
            }
        });
        System.out.println(Arrays.toString(arr2));  // Arrays.toString() : 배열의 요소 값을 찍도록 오버라이딩 되어 있음
    }
}

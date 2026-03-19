package 정렬실습;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
    임의의 10개의 과일이름 입력 후 길이 순으로 정렬하기, 길이가 같으면 사전순으로 정렬
    - return 1(양수); 정렬조건
    - return 0; 두 객체가 같음
    - return -1(음수); : 현상유지

    compareTo() : 사전 순서 정렬
    - return 0; 두 개체가 같다.
    - return 1(양수); 첫 번째 객체가 크다.
    - return -1(음수); 첫 번째 객체가 작다.
*/
public class SortEx {
    public static void main(String[] args) {
        // 문자열 배열 만들고, 과일 이름 10개 입력 받기
        Scanner sc = new Scanner(System.in);
        String[] fruit = {
          "Kiwi", "Orange", "Grape", "Banana", "Apple",
          "FineApple", "Mango", "Melon", "Cherry", "Peach" };
//        for (int i = 0; i < fruit.length; i++) {
//            System.out.print("과일이름 입력 (영문으로) " + (i + 1) + " : ");
//            fruit[i] = sc.nextLine();
//        }

        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;    // 정렬 조건
                else {
                    // 길이가 같으면 사전 순 정렬
                    if ((o1.length() == o2.length())) return o1.compareTo(o2);
                    return -1;  // 정렬 조건이 아님
                }
            }
        });

        System.out.println(Arrays.toString(fruit));
    }
}

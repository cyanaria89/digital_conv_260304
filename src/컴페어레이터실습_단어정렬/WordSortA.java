package 컴페어레이터실습_단어정렬;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSortA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 단어 갯수 : ");
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < n; i++) { System.out.print("단어 입력 : "); set.add(sc.nextLine().trim()); }

        for (String e : set) { System.out.println(e); }
    }
}

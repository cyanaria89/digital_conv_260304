package 컴페어레이터실습_단어정렬;

import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> setList = new HashSet<>();

        System.out.print("영단어 몇 개 입력? : ");
        int n = sc.nextInt(); sc.nextLine();

        int cnt = 0;
        while (cnt < n) {
            System.out.printf("[" + (cnt + 1) + "] 영단어 입력 : ");
            String word = sc.nextLine().trim();
            setList.add(word.toLowerCase());
            cnt++;
        }

        List<String> list = new ArrayList<>(setList);

        list.sort(new WordComparator());

        for (String e : list) { System.out.println(e); }
    }
}

class WordComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() != o2.length()) return o1.length() - o2.length();
        return o1.compareTo(o2);
    }
}
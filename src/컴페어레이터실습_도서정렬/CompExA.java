package 컴페어레이터실습_도서정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompExA {
    public static void main(String[] args) {
        // List 생성
        List<BookA> books = new ArrayList<>();
        books.add(new BookA("사피엔스", "유발 하라리", 20000, 2020));
        books.add(new BookA("정의란 무엇인가?", "마이크 샌델", 26000, 2010));
        books.add(new BookA("총.균.쇠.", "제레드 다이아몬드", 28000, 2005));

        // 가격 오름차순 정렬
        System.out.println("====== 가격 오름차순 ======");
        books.sort(new PriceComparator());
        for (BookA book : books) {
            System.out.println(book);
        }

        // 출판년도 내림차순 정렬
        System.out.println("====== 연도 내림차순 ======");
        books.sort(new YearComparator());
        for (BookA book : books) {
            System.out.println(book);
        }
    }
}

class BookA {
    String title;
    String author;
    int price;
    int year;

    public BookA(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-8s | %,5d원 | %d년", title, author, price, year);
    }
}

class PriceComparator implements Comparator<BookA> {
    // 가격, 오름차순
    @Override
    public int compare(BookA o1, BookA o2) {
        /* 이하 코드도 결과는 동일함
        if (o1.price > o2.price) return 1;          - 정렬 O
        else if (o1.price == o2.price) return 0;    - 값 일치
        else return -1;                             - 정렬 X
        */
        return o1.price - o2.price;
    }
}

class YearComparator implements Comparator<BookA> {
    // 연도, 내림차순
    @Override
    public int compare(BookA o1, BookA o2) {
        /*
        if (o1.year < o2.year) return 1;
        else if (o1.year == o2.year) return 0;
        else return -1;
        */
        return o2.year - o1.year;
    }
}
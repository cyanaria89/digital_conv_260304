package 컴페어레이터실습_도서정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompEx {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("자바 웹을 다루는 기술", "이병승", 45000, 2024));
        list.add(new Book("이것이 자바다 1권", "신용권, 임경균", 19000, 2025));
        list.add(new Book("이것이 자바다 2권", "신용권, 임경균", 19000, 2025));
        list.add(new Book("최소한의 한국사", "최태성", 18000, 2025));
        list.add(new Book("최소한의 세계사", "임소미", 18800, 2023));
        list.add(new Book("ETF 투자의 모든 것", "문일호", 18900, 2025));
        list.add(new Book("ETF 투자 무작정 따라하기", "윤재수", 22000, 2024));
        list.add(new Book("러브크래프트 전집 세트", "H.P.러브크래프트", 108000, 2015));
        list.add(new Book("눈물을 마시는 새 세트", "이영도", 66000, 2015));
        list.add(new Book("박태웅의 AI 강의 2026", "박태웅", 23000, 2026));

        list.sort(new BookComparator());

        int num = 0;
        for (Book book : list) {
            System.out.println("[" + ++num + "]");
            System.out.println(book);
        }
    }
}

class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.year != o2.year) return o2.year - o1.year;
        else if (!o1.title.equals(o2.title)) return o1.title.compareTo(o2.title);
        return o1.price - o2.price;
    }
}

class Book {
    String title;
    String author;
    int price;
    int year;

    public Book(String title, String author, int price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "제목 : " + title + " | 저자 : " + author + "\n가격 : " + price + " | 출판연도 : " + year + "\n---------------------";
    }
}
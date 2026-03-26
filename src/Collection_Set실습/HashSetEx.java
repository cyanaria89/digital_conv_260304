package Collection_Set실습;

import java.util.HashSet;
import java.util.Set;
/*
    Set 도 Collections 계열이기 때문에 .add 사용
*/
public class HashSetEx {
    public static void main(String[] args) {
        Set<BookA> books = new HashSet<>();

        books.add(new BookA(101, "자바의 정석", "남궁성"));
        books.add(new BookA(102, "클린코드", "로버트 마틴"));
        books.add(new BookA(103, "운영체제", "공룡책"));
        books.add(new BookA(103, "리팩터링", "마틴 파울러"));

        for (BookA b : books) {
            System.out.println(b);
        }
    }
}

class BookA {
    int isbn;
    String title;
    String author;

    public BookA(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ISBN : " + isbn + "\n제목 : " + title + "\n저자 : " + author + "\n----------------\n";
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BookA) {
            BookA b = (BookA) obj;
            if (this.isbn == b.isbn) return true;
            else return false;
        }
        return false;
    }
}
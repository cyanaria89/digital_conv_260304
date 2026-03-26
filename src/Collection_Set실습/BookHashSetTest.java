package Collection_Set실습;

import java.util.HashSet;
import java.util.Set;

public class BookHashSetTest {
    static Set<Book> books = new HashSet<>();
    public static void main(String[] args) {
        books.add(new Book(101, "자바의 정석", "남궁성"));
        books.add(new Book(102, "클린코드", "로버트 마틴"));
        books.add(new Book(103, "운영체제", "공룡책"));
        books.add(new Book(103, "리팩터링", "마틴 파울러"));

        for (Book b : books) {
            b.showBook();
        }
    }
}
